import java.util.*;
public class UnionIntersectionTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Union of two arrays
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("The Union of the array is: " + set.size()+" ,  Elements : " + set);

        // Intersection of two arrays

        set.clear(); // Clear the set to reuse it for intersection
        for(int i =0 ; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count =0;
        for(int i =0 ; i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]); // To avoid counting duplicates
            }
        }
        System.out.println("The Intersection of the array is: " + count+" ,  Elements : " + set);
    }
}
