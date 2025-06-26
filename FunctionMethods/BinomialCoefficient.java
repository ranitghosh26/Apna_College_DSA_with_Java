import java.util.*;
public class BinomialCoefficient {
    
 
    
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

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;

    }
    public static int bioCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);
        
        int bioCoeff=fact_n/(fact_r*fact_nr);
        return bioCoeff;

    }



    public static void main(String[] args) {
        System.out.println(bioCoeff(5,2));
        
        

        
    }



    
}

    

