public class FibonacciNo {

    // Problem:05
    // Print the Fibonacci series up to n terms.
    // Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    
    public static int Fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n == 0|| n == 1) {
            return n;
            
        }
        
        // Recursive case: Fibonacci(n) = Fibonacci(n - 1) + Fibonacci(n - 2)
        int fnm1 = Fibonacci(n - 1);
        int fnm2 = Fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    
    public static void main(String[] args) {
        // int n=26;
        System.out.println("Fibonacci series up to : " +Fibonacci( 23) );
        System.out.println("Fibonacci series up to : " +Fibonacci( 24) );
        System.out.println("Fibonacci series up to : " +Fibonacci( 25) );
        System.out.println("Fibonacci series up to : " +Fibonacci( 26) );
        System.out.println("Fibonacci series up to : " +Fibonacci( 27) );
        System.out.println("Fibonacci series up to : " +Fibonacci( 28) );
        
    }
    
}
