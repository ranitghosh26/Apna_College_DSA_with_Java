public class In  {

    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.color = "Blue";
        f1.eat();
        f1.breaths();
        f1.swim();
        System.out.println(f1.color);
        System.out.println(f1.fins);

    }
}    

class Animal {
    String color;
    void eat(){
        System.out.println("Eating...");
    }
    void breaths(){
        System.out.println("Breathing...");
    }

    
}

// Derived class

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming...");
    }
}


    

