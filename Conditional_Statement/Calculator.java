import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A : ");
        int a=sc.nextInt();
        System.out.println("Input B : ");
        int b=sc.nextInt();
        System.out.println("Input Operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            
            case '+': System.out.println(a+b);
            
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;

        
            default: System.out.println(" Wrong " );
                break;
        }
    }
    
}
