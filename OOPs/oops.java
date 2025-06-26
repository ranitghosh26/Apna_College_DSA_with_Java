// package OOPs;

public class oops {

public static void main(String[] args) {
    Pen p1= new  Pen();
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    // p1.setColor("Red");
    p1.color="Yellow";
    System.out.println(p1.color);


    BankAccount MyAcc =new BankAccount();
    MyAcc.username="RanitGhosh";
    MyAcc.setpassword("12345678");
    
    

    }


    
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String newPassword){
        password=newPassword;
    }
}




class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }    

}

class Student{
    String name;
    int age;
    float percentage;

    void calParcentage(int m1, int m2, int m3){
        percentage=(m1+m2+m3)/3;
    }


}
