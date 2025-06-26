import java.util.Scanner;

public class Cancatination {

    public static void printletter(String str){
        for( int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);

        String firstname;
        String lastname;
       
       
        System.out.println("Enter your firstname : ");
       
        firstname= sc.nextLine();
        System.out.println("Enter your lastname : ");
        lastname= sc.nextLine();
      
        System.out.println("Your firstname is : "+firstname);
        System.out.println("Your lastname is : "+lastname);

        String fullname= firstname + " " + lastname;
        System.out.println("Your name is : "+fullname);


        // String  langth
        System.out.println("Length is : "+fullname.length());
    
    
        printletter(fullname);

        



    
    
    }
}
