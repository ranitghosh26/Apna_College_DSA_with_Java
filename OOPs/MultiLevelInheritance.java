public class MultiLevelInheritance  {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        // d1.color = "Brown";
        d1.legs = 4;
        // d1.breed = "Labrador";
        d1.eat();
        // d1.breaths();
        // System.out.println(d1.color);
           System.out.println(d1.legs);
        // System.out.println(d1.breed);
        

    }
}    

//    Base class
class Animal {
    String color;

    void eat(){
        System.out.println("Eating...");
    }
    void breaths(){
        System.out.println("Breathing...");
    }

    
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
// Derived class

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swimming...");
//     }
// }




    


