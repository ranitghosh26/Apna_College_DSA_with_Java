import java.util.*;
public class PrintLargestNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int A=sc.nextInt();
        System.out.println("Enter B Value : ");
        int B=sc.nextInt();
        System.out.println("Enter C Value : ");
        int C=sc.nextInt();

        if ((A>=B) && (A>=C)) {
            System.out.println("A is a largest");
            
        } 
        else if (B>=C) {
            System.out.println("B is a Largest");
        } else {
            System.out.println("C is a Largest"); 
        }
       
    }
}
