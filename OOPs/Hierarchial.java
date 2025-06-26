public class Hierarchial{

    public static void main(String[] args) {
        // Creating objects of different subclasses
        Mammal ML = new Mammal();
        Fish fish = new Fish();
        Bird bird = new Bird();

        // Demonstrating functionality
        System.out.println("Mammal:");
        ML.eat();
        ML.breaths();
        ML.walk();

        System.out.println("\nFish:");
        fish.eat();
        fish.breaths();
        fish.swim();

        System.out.println("\nBird:");
        bird.eat();
        bird.breaths();
        bird.fly();

        
        

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
    void walk(){
        System.out.println("Walking...");
    }
}
class Fish extends Animal{
   void swim(){
        System.out.println("Swimming...");
    }

}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }

}




    


