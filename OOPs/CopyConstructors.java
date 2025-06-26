public class CopyConstructors  {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="RanitGhosh";
        s1.roll=101;
        s1.password="12345678";
        s1.masks[0]=100;
        s1.masks[1]=90;
        s1.masks[2]=80;

        Student s2 = new Student(s1);
        s1.password="xyz";

        s2.masks[2]=100;
        for(int i=0; i<3;i++){
            System.out.println(s2.masks[i]+" ");
        }


        
    }
    
}

class Student {
    String name;
    int roll;
    String password;
    int masks[];
    class Address{
        String city;
        // String state;
        // String country;
    }

    // Copy Constructor
    Student(Student s1){
        masks= new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.masks = s1.masks;
       
    }

    Student(){
        masks= new int[3];
        System.out.println("Constructor is  called.....");
    }
    Student(String name){
        masks= new int[3];
        this.name = name;
    }
    Student ( int roll){
        masks= new int[3];
        this.roll= roll;
    }    
        
}

    

