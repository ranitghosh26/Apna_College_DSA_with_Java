// public class OopsPracticeQu {
    
// }


// Practice Questions 01
// Find out the correct statement to assign name to object 

// a. Student->name = "John";  
// b. Student.name = "John";
// c. Student.name="John"; { Right }

// Code :

// class Student{
//     String name;
//     int marks;
// }
// public class StudentName{
//     public static void main(String[] args) {
//         Student S = new Student();
//         S.name = "John"; // Correct way to assign name to object
//     }
// }

// Practice Questions 02
// Which variable(s) can the class Person access in the following code?

// a. name       {Right}
// b. weight     {Right}
// c. rollNumber
// d. schoolName        

// Code :

// class Person{
//     String name;
//     int weight;
  
// }
// class Student01 extends Person{
//     int rollNumber;
//     static String schoolName;
// }



// Practice Questions 03
// Whish of the following modifiers are not allowed in front of class.
// a. private
// b. protected
// c. public  {Right}
// d. default  {Right}



// Practice Questions 04
// Which of the following is a corrert statement? (both classs in same package)

// class Vehicle{}
// class Car extends Vehicle{}

// a. Car C = new Car();  {Right}
// b. Vehicle V = new Vehicle(); {Right}
// c. Vehicle V = new Car();  {Right}
// d. Car C = new Vehicle();  


 // Practice Questions 05
// What will be output of this code? ( Both class is same package)

// public class inheritence{
//     public static void main(String[] args) {
//         Vehicle obj1 = new Car();
//         obj1.print(); // This will call the start method of Car class

//         Vehicle obj2 = new Vehicle();
//         obj2.print(); // This will call the start method of Vehicle class
//     }
// }
// class Vehicle{
//     void print(){
//         System.out.println("Basic Vehicle class");
//     }
// }
// class Car extends Vehicle{
//     void print(){
//         System.out.println("Car class");
//     }
 
// }

// Practice Questions 06
// What will be output of this code? ( Both class is same package)

// public class inheritence{
//     public static void main(String[] args) {
//         Vehicle obj1 = new Car();
//         obj1.print1(); // This will call the start method of Car class

//         Vehicle obj2 = new Vehicle();
//         obj2.print(); // This will call the start method of Vehicle class
//     }
// }
// class Vehicle{
//     void print(){
//         System.out.println("Basic Vehicle class");
//     }
// }
// class Car extends Vehicle{
//     void print1(){
//         System.out.println(" Derived class Car");
//     }
 
// }

// Anss : Error-  Line : 10


// Practice Questions 07

// Whish of the following is not an OOPS component?
// a. Inheritance {Right}
// b. Encapsulation {Right}
// c. Polymorphism {Right}
// d. Compilation 
// e. Abstraction



// Practice Questions 08

// What will be output of this code? 

// class Book{
//     int price;
//     static int count;

//     public Book(int price) {
//         this.price = price; 
//         count++;
//     }
// }
// public class BookStore {
//     public static void main(String[] args) {
//         System.out.println(Book.count);
//         Book b1 = new Book(150);
//         Book b2 = new Book(250);
//         // Book b3 = new Book(300);

//         System.out.println("Total books sold: " + Book.count); // Output: 3
//     }
// }

// Output : 
// a. Error
// b. 0 2 (Right)
// c. 1 2
// d. 2 2

 

// Practice Questions 09

// Which line has Error?

// class Test{
//     static int marks;
//     void setMarks(int marks){
//         this.marks = marks;   // Line 1     // Correct way to assign value to static variable
//     }
// }
// class Student{
//     public static void main (String[] args) {
//         Test t = new Test();
//         t.setMarks(98); // Line 2
//         System.out.println(Test.marks); // Line 3
//     }
// }

// Error : No Error any Line.


// Practice Questions 10
// What will be output of this code?

class Test {
    static int a = 10;
    static int b;
    static void changeB(){
        b=a*3;
    }

}
class BookStore{
    public static void main(String[] args) {
        Test t = new Test(); // This will call the constructor of Test class
        Test.changeB(); // This will call the changeB method
        System.out.println("New B: "+(Test.a + Test.b)); // Output: 10 30
    }
}