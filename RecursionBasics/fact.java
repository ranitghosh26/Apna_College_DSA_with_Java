public class fact {

    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 ) {
            return 1;
        }
        // Recursive case: n * factorial of (n - 1)
        int nm1= factorial(n - 1);
        int fn=n*factorial(n - 1);
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
        
    }
    
}
