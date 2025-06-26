import java.util.*;
public class Product9_OFab {
    

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

    }

    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }



    public static void main(String[] args) {

        
        int a=3;
        int b=5;
        int prod= multiply(a, b);
        System.out.println("prod="+prod);
        prod=multiply(10, 20);
        System.out.println("a*b="+prod);

        
    }



    
}
