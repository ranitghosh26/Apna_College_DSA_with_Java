import java.util.*;
public class CallByValue {
    public static void printHelloWorld() {
        System.out.println("Hello Woold");
        System.out.println("Hello Woold");
        System.out.println("Hello Woold");
    
    }
    public static  int calculateSum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public static void swap(int a, int b){
        // swap
        int  temp =a;
        a=b;
        b=temp;

        System.out.println("a="+a);
        System.out.println("b="+b);

    }



    public static void main(String[] args) {

        // swap-value exchange
        int a=5;
        int b=10;
        swap(a, b);

        
        
    }

}
    

