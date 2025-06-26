public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); // Calls the overridden method in Deer class
    }
    
}
// class Animal{

class Animal{
    void eat(){
        System.out.println("Eating anything...");
    }
}
class Deer extends Animal {
    void eat(){
        System.out.println("Eating grass...");
    }
}

class Calculator{
    int sum( int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int Subtraction (int a, int b){
        return a-b;
    }
    float Subtraction (float a, float b){
        return a-b;
    }
   
    
    int Multiplication (int a, int b){
        return a*b;
    }


}