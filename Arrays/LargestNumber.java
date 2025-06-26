public class LargestNumber {
    public static int LargestNumber(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;


        for(int i=0; i<numbers.length;i++){
            if(Largest<numbers[i]){
                Largest=numbers[i];
            }
            if (smallest>numbers[i]) {
                smallest=numbers[i];    
                
            }
          
        }
        System.out.println("Smallest Number is : "+smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Largest Number is : "+LargestNumber(numbers));
        
    }
    
}
