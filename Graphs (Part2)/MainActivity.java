// Remove the stray "android" line at the top of the file

// ...existing code...
package com.example.mobiletracker;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.*;
import com.google.firebase.database.*;

import java.util.concurrent.TimeUnit;



public class MainActivity extends AppCompatActivity {
    private static final int LOCATION_REQUEST_CODE = 100;
    private FusedLocationProviderClient fusedLocationClient;
    private FirebaseAuth mAuth;
    private DatabaseReference dbRef;
    private String userId = "user123"; // Replace with actual user ID or phone

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        dbRef = FirebaseDatabase.getInstance().getReference("locations").child(userId);

        requestLocationPermission();
        startLocationTracking();
        initiateOTP("+91xxxxxxxxxx");
    }

    private void requestLocationPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                LOCATION_REQUEST_CODE);
        }
    }

    private void startLocationTracking() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            fusedLocationClient.getLastLocation()
                .addOnSuccessListener(location -> {
                    if (location != null) {
                        uploadLocation(location);
                    }
                });
        }
    }

    private void uploadLocation(Location location) {
        LocationData locData = new LocationData(location.getLatitude(), location.getLongitude());
        dbRef.setValue(locData);
    }

    private void initiateOTP(String phoneNumber) {
        PhoneAuthOptions options =
            PhoneAuthOptions.newBuilder(mAuth)
                .setPhoneNumber(phoneNumber)
                .setTimeout(60L, TimeUnit.SECONDS)
                .setActivity(this)
                .setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    public void onVerificationCompleted(PhoneAuthCredential credential) {
                        mAuth.signInWithCredential(credential)
                            .addOnCompleteListener(task -> {
                                if (task.isSuccessful()) {
                                    userId = mAuth.getCurrentUser().getUid();
                                    startLocationTracking();
                                }
                            });
                    }

                    public void onVerificationFailed(FirebaseException e) {
                        e.printStackTrace();
                    }

                    public void onCodeSent(String verificationId,
                                           PhoneAuthProvider.ForceResendingToken token) {
                        // OTP sent — collect from user manually if needed
                    }
                })
                .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    public static class LocationData {
        public double latitude;
        public double longitude;

        public LocationData() { }
        public LocationData(double lat, double lon) {
            this.latitude = lat;
            this.longitude = lon;
        }
    }
}
