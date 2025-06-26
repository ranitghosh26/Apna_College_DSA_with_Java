public class fastExponentiation {
    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println("2^5 : " + fastExponentiation(2, 5)); // 32
        System.out.println("3^4 : " + fastExponentiation(3, 4)); // 81
        System.out.println("5^3 : " + fastExponentiation(5, 3)); // 125
        System.out.println("7^2 : " + fastExponentiation(7, 2)); // 49
        System.out.println("10^2 : " + fastExponentiation(10, 2)); // 1
        
    }
    
}
