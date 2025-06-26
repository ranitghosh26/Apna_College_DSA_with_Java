// package DivideConquer;

import java.util.Arrays;

// input: sorted, rotated array with distinct numbers (in ascending order) It is rotated at a pivot point. 
// Find the index of given element.
//  [ 4,5,6,7,0,1,2]  // 0 is the pivot point.
// Output :  4

public class SearchInRotatedSortArray {
    public static int SearchInRotatedSortArray(int arr[],int tar,int si,int ei){

         if (si > ei) {
            return -1; // not found
            
         }


        int mid = si + (ei - si) / 2; // (si + ei) / 2; // to avoid overflow

        // case FOUND
        if (arr[mid] == tar) {
            return mid;
        }
        // case NOT FOUND
        // case 1: mid on L1
        
        if (arr[si]<=arr[mid]) {
            // case a : left
            if (arr[si]<=tar && tar <= arr[mid]) {
                return SearchInRotatedSortArray(arr, tar, si, mid-1); 
            } else { // case b : right
                return SearchInRotatedSortArray(arr, tar, mid + 1, ei);
            }
            
        }
        else{
            // case 2: mid on L2
            // case c : Right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return SearchInRotatedSortArray(arr, tar, mid + 1, ei); 
            } else { // case d : right
                return SearchInRotatedSortArray(arr, tar, si, mid - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        int tarIdx=SearchInRotatedSortArray(arr, target, 0, arr.length - 1);
        System.out.println("Targat Index : "+tarIdx); // Output: 4);
    }

    
}
