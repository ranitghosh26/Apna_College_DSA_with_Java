import java.util.*;
public class SyntaxParameters {
    public static void printHW(){
        System.out.println("Ranit");
        System.out.println("Ranit");
        System.out.println("Ranit");
        return ;
    }
    public static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is : "+ sum);

    }
    public static void main(String[] args) {
        calculateSum();
    }
    
}

