import java.util.*;
public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks=sc.nextInt();
        String stutus=marks>=33? "pass" : "Fail";
        System.out.println(stutus);

      
      
    }
    
}
