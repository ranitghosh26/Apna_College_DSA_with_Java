
import java.util.*;
public class MerGeSort {

    public static void MerGeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        MerGeSort(arr, si, mid);
        MerGeSort(arr, mid+1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si; // starting index of left subarray
        int j=mid+1; // starting index of right subarray
        int k=0; // starting index of temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        //lft part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
            
        }

        // right part 
        while (j<=ei) {
            temp[k++]=arr[j++];
            
            
        }

        //copying temp to original array
        for (k = 0, i=si; k < temp.length; k++,i++) {
            arr[i]=temp[k];
            
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        MerGeSort(arr, 0, arr.length-1);
       
       
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        
    }

     
}


