
import java.util.*;
public class BinaryToDecimal {
    


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
        // func to calc sum of 2 nums ( int value )
        public static int sum(int a, int b){
            return a+b;
        }

        // func to calc sum of 2 nums(float value )
        public static float sum( float a, float b, float c){
            return a+b+c;
        }
    
        // Only for n>=2
        // public static boolean isPrime(int n) {
        //     // Corner cases 
        //     //2
        //     if(n==2){
        //         return true;

        //     }
           
        //     for(int i=2;i<=n-1;i++){
        //         if (n%i==0) { // Comletely dividing 
                    
        //             return false;
                    
                    
        //         }
        //     }
        //     return true;
        // }




        public static boolean isPrime(int n){
            if (n==2) {
                return true;
                
            }

            for(int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0)
                {
                    return false;
                
                }
            }
            return true;

        }




        public static void binToDeml(int binNum){
            int MyNum=binNum;
            int pow=0;
            int decNum=0;

            while (binNum>0) {
                int lastDigit=binNum%10;
                decNum=decNum+(lastDigit*(int)(Math.pow(2, pow)));

                pow++;
                binNum=binNum/10;
            }

            System.out.println("decimal of " +MyNum+" = "+decNum);

        }




        public static void PrimeInRange(int n){
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
            System.err.println( );
        }





        public static void main(String[] args) {
           
           binToDeml(101);
           
           
            
            
           
    
            
        }
    
    
    
        
    }
    
        
    
    
