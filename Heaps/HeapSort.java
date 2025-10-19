import java.util.*;


public class HeapSort {
    public  static void heapify(int arr[], int i, int n){
        int l = 2*i+1;
        int r = 2*i+2;
        int maxidx = i;

        if(l<n && arr[l]>arr[maxidx]){
            maxidx = l;
        }
        if(r<n && arr[r]>arr[maxidx]){
            maxidx = r;
        }

        if(maxidx != i){
            // swap
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr, maxidx, n);
        }
    }
    public static void HeapSort(int arr[]){
        // step1 - Build Heap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }
        // step2 - Remove element from heap
        for(int i=n-1; i>0; i--){
            // swap first and last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify on reduced heap
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};

        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
