import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("Even");
            
        } else {
            System.out.println("odd");
        }
    }
    
}
