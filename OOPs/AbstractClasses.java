// public class AbstractClasses {
//     public static void main(String[] args) {
//         Horse h = new Horse();
//         h.eat(); // Calls the method from Animal class
//         h.walk(); // Calls the overridden method in Horse class
//         Chicken c = new Chicken();
//         c.eat(); // Calls the method from Animal class
//         c.walk(); // Calls the overridden method in Chicken class
        
//         System.out.println("Animal Color: " + h.color); // Accessing the color property
//         // System.out.println("Chicken color: " + c.color); // Accessing the color property
//     }
// }
// abstract class Animal{
//     // Abstract class cannot be instantiated
//     String color;

//     Animal(){
//         color = "Brown";
//     }

//     void eat(){
//         System.out.println("Eating anything...");
//     }
//     abstract void walk(); // Abstract method without a body
// }

// class Horse extends Animal {
//     void changecolor(String c){
//         color = "Dark Brown";
//     }
//     void walk() {
//         System.out.println("Horse is walking 4 legs...");
//     }
// }

// class Chicken extends Animal {
//     void changecolor(String c){
//         color = "White";
//     }
//     void walk() {
//         System.out.println("Chicken is walking 2 legs...");
//     }
// }


public class AbstractClasses {
    public static void main(String[] args) {
        Mustang m = new Mustang();
    }
}
abstract class Animal{
    // Abstract class cannot be instantiated
    String color;

    Animal(){
        color = "Brown";
        System.out.println("Animal constructor called..."); 
    }

    void eat(){
        System.out.println("Eating anything...");
    }
    abstract void walk(); // Abstract method without a body
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called..."); 
    }
    void changecolor(String c){
        color = "Dark Brown";
    }
    void walk() {
        System.out.println("Horse is walking 4 legs...");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called..."); 
    }
    // void changecolor(String c){
    //     color = "Black";
    // }
    // void walk() {
    //     System.out.println("Mustang is walking 4 legs...");
    // }
}

