
// Question1: Write a Javaprogram to get a number from the user and print whether it is
// positive or negative.

// import java.util.*;
// public class ConditonalPQ {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Input Number : ");
//         int input =sc.nextInt();
        
//         if (input>0) {
//             System.out.println("Positive");
            
//         } 
//         else if (input<0) {
//             System.out.println("Nagative");
//         } 
//         else {
//             System.out.println("Number is 0 ");
            
//         }
//     }
    
// }

 // Question 2 : Finish the following code so that it prints You have a fever if your temperature
//  is above 100 and otherwise prints You don't have a fever


// import java.util.*;
// public class ConditonalPQ {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Input Temperature : ");
//         float input =sc.nextFloat();
        
//         if (input>100) {
//             System.out.println("fever");
            
//         } 
      
//         else {
//             System.out.println("don't have a fever");
            
//         }
//     }
    
// }


// Question 3: Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
// using switch case.

// import java.util.*;
// public class ConditonalPQ {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Input Temperature : ");
//         int input =sc.nextInt();
        
//         switch (input) {
//             case 1:System.out.println("Sunday");
//                 break;
//             case 2:System.out.println("Monday");
//                 break;
//             case 3:System.out.println("Tuesday");
//                 break;
//             case 4:System.out.println("Wednesday");
//                 break;
//             case 5:System.out.println("Thursday");
//                 break;
//             case 6:System.out.println("Friday");
//                 break;
//             case 7:System.out.println("Saturday");
//                 break;
                
//             default: System.out.println("No day");
//                 break;
//         }
//     }
    
// }



// Question 4 : What will be the value of x & y in the following program.


// public class ConditonalPQ {
    
//     public static void main(String args[]) {
//     int a = 63, b = 36;
//     boolean x = (a < b )? true : false;
//     int y= (a > b ) ? a : b;
//     System.out.println(x);
//     System.out.println(y);

//     }
// }


// Question 5 : Write a Java program that takesa year from the user and print whether that year is a leap year or not.


import java.util.*;
public class ConditonalPQ {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=sc.nextInt();

    
    if (year%400==0 && year%100==0 || year%100!=0 && year%4==0) {
        System.out.println("This is a leap year");
        
    } else {
        System.out.println("This is not a leap year");

        
    }
    

    }
}
    