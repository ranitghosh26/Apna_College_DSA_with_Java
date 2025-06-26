public class fastOccurence {

    // WAF  to find the first occurrences of an element in an array .


    public static int firstOccurence(int arr[], int key, int i) {
        // Base case: if we reach the end of the array, return -1 (not found)
        if (i == arr.length) {
            return -1;
        }

        // Check if the current element is equal to x
        if (arr[i] == key) {
            return i; // Return the index of the first occurrence
        }

        // Recursive case: check the next element
        return firstOccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     int key = 5;
        System.out.println("firstOccurence : "+(firstOccurence(arr, 5, 0))); // Start searching from index 0

       
    }

    
}
