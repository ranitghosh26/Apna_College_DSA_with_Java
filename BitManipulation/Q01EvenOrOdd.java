// package BitManipulation;

public class Q01EvenOrOdd {


    public static void  EvenOrOdd( int n){
        int bitmask = 1; // 0001
        if((n & bitmask)==0){
           System .out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }


    public static void main(String[] args) {
        EvenOrOdd(5);
        EvenOrOdd(6);
        EvenOrOdd(0);
        
    }

    
}
