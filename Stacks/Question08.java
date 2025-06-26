import java.util.Stack;
// Max Rectangular Area in Histogram (Code)

public class Question08 {
    public static void CalculateArea(int arr[]){
        int maxArea=0;
    
        int NextSmallR[]=new int[arr.length];
        int NextSmallL[]=new int[arr.length];

        // Next Greater Element to the right
        Stack<Integer> s= new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
        // While
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            NextSmallR[i]=arr.length;
        } else{
            NextSmallR[i]=s.peek();
        }
        s.push(i);
        }
         //Next Greater Element to the Left
        s= new Stack<>();
        for(int i= 0;i>=arr.length;i++){
        // While
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            NextSmallL[i]=arr.length;
        } else{
            NextSmallL[i]=s.peek();
        }
        s.push(i);
        }

        

        // Calculate Area  :j-i-1 ,  width = NextSmallR[i] - NextSmallL[i] - 1
        for(int i=0;i<arr.length;i++){
            int hight= arr[i];
            int width=NextSmallL[i]-NextSmallR[i]-1;
            int Area=hight*width;
            maxArea=Math.max(maxArea, Area);

        }
        System.out.println("Maximum Area is: " + maxArea);

    }

    public static void main(String[] args) {
        int arr[]={ 2, 1, 5, 6, 2, 3 };
        CalculateArea(arr);
        // Output: Maximum Area is: 10
    }
}
