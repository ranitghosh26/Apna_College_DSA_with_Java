public class ClearlastBits {


    public static int ClearlastBits(int n , int i){
        int  bitmask =(~0)<<i;
        return n & bitmask;
    }




    public static void main(String[] args) {
        System.out.println("Ans : " + ClearlastBits(15, 2));
    }
    
}
