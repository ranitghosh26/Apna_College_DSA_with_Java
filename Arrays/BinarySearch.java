public class BinarySearch {


public static int BinarySearch(int numbers[], int key){
    int start=0;
    int end = numbers.length-1;

    while(start<=end){
        int mid=(start+end)/2;


        //comparisons

        if (numbers[mid]==key) { // found
            return mid;

            
        }
        if (numbers[mid]<key) {   // right
            start=mid +1;

            
        } else{     // left
            end=mid-1;
        }
    }
    return-1;
}
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key=4;

        System.out.println("Key found at index : "+BinarySearch(numbers,key));
    }
    
}
