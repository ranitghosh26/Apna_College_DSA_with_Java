// public class TernaryOperator {
//     public static void main(String[] args) {
//         int number=4;
//         String type=((number%2)==0)?"Even":"Odd";
//         System.out.println(type);
//     }
// }

import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");

        int number=sc.nextInt();
        String type=((number%2)==0)?"Even":"Odd";
        System.out.println(type);
    }
}