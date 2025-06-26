public class ClearBitsRange {



    public static int ClearBitsRange( int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println("Ans : " + ClearBitsRange(10, 2, 4));
        // 1111
        // 1100
        // 0000
        // 0000
        // 0000
        // 0000
        // 0000
        
    }
    
}
