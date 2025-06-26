// package BitManipulation;
import java.util.Scanner;

public class GetithBIT {


    public static int GetithBIT( int n ,int i){
        int bitmask=1<<i;
        if((n & bitmask) == 0){
            return 0;
        } else{
            return 1;
        }
    }


    
    public static void main(String[] args) {
        System.out.println("Ans : " +GetithBIT(10,2));
        
    }
    
}
