import java.util.*;

class Palindrome {
    
    public static void main(String arge []){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int c=x;
        int s=0;

        while(x>0){
            int r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(c==s){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}





