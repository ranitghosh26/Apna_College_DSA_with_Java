public class UpdateithBIT {

    public static int UpdateithBIT( int n, int i, int  newbit){
        // if (newbit==0) {
        //     return ClearithBIT(n, i);
            
        // } else{
        //     return SetithBIT(n, i);
        // }

        // Clear the ith bit

        n = ClearIthBIT(n, i);
        int bitmask = newbit << i; // Shift the new bit to the ith position
        return n | bitmask; // Set the ith bit to the new bit value
    }






    // Method to clear the ith bit
    public static int ClearIthBIT(int n, int i) {
        int bitmask = ~(1 << i); // Create a bitmask with the ith bit cleared
        return n & bitmask; // Clear the ith bit in n
    }



public static void main(String[] args) {
    System.out.println("Ans : " + UpdateithBIT(10,2 ,1));
}
    
}
