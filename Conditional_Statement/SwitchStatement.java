// public class SwitchStatement {
//     public static void main(String[] args) {
//         int number =2;
//         switch (number) {
//             case 1: System.out.println("Somosa");
//                 break;
//             case 2: System.out.println("Burger");
//                 break;
//             case 3: System.out.println("mango");
//                 break;   
        
//             default: System.out.println("We wake up");
//                 break;
//         }
//     }
// }

import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Number : ");
        int number =sc.nextInt();
        switch (number) {
            case 1: System.out.println("Somosa");
                break;
            case 2: System.out.println("Burger");
                break;
            case 3: System.out.println("mango");
                break;   
        
            default: System.out.println("We wake up");
                break;
        }
    }
}
