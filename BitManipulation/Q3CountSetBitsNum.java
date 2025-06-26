public class Q3CountSetBitsNum {

    public static int Q3CountSetBitsNum(int n){
        int count =0;
        while (n>0) {
            if ((n&1)!=0) {
                count++;
                
            }
            n = n >> 1;
            
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println("Ans : " + Q3CountSetBitsNum(15)); 
        
    }
    
}