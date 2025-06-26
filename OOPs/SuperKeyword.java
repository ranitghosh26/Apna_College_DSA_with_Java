public class SuperKeyword {
    public static void main(String[] args) {
        Horse Horse = new Horse(); // This will call the constructor of Animal first, then Horse
        // Output:
        // Animal constructor called
        // Horse constructor called
        System.out.println(Horse.Color); // This will print "Brown"
        
    }
    
}
class Animal {
    String Color;
    Animal() {
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal {
    
    Horse() {
        super.Color="Brown"; // This will call the constructor of Animal first
        // super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Horse constructor called");
    }
}
