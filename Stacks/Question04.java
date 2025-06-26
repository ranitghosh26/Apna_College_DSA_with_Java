
import java.util.Stack;
public class Question04 {

    public  static void StackSpan(int stocks[],int span[]){
        Stack<Integer> s= new Stack<>();
        s.push(0);


        for(int i=1;i<stocks.length;i++){
            int currentPrice = stocks[i];
            while(!s.isEmpty() && stocks[s.peek()] <= currentPrice){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            } else {
                int previousIndex = s.peek();
                span[i] = i - previousIndex;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[]={ 100, 80, 60, 70, 60, 75, 85 };
        int span[]=new  int[stocks.length];
        StackSpan(stocks,span);
        System.out.println("Stock Span: ");

        for(int i=0; i<span.length;i++){
            System.out.println(span[i]+"");
        }

    }
    
}
