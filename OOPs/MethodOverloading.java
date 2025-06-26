public class MethodOverloading {
   
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.sum(5, 10));
        System.out.println(cl.sum(5.5f, 10.5f));
        System.out.println(cl.sum(5, 10, 15));
        System.out.println(cl.Subtraction(10, 5));
        System.out.println(cl.Subtraction(10.5f, 5.5f));
        System.out.println(cl.Multiplication(5, 10));
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

