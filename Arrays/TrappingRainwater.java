import java.util.*;

public class TrappingRainwater {

    public static int trappingRainwater(int height[]) {
        int n = height.length;
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // Loop to calculate trapped water
        for (int i = 0; i < n; i++) {
            // Calculate water level - min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate trapped water - water level - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped rainwater is: " + trappingRainwater(height));
    }
}