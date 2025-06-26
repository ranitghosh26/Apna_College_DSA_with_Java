public class MaxSubarraySum {
    
    public static void MaxSubarraySum(int  numbers[]){
   

    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        int carrsum=0;
        
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                
                carrsum+=numbers[k];
            }        
            System.out.println(carrsum);   
           if (carrsum>maxSum){
            maxSum=carrsum;
           } 
            
           
        }
        
    }
    
    System.out.println("Max Sum : " + maxSum);
}

public static void main(String[] args) {
    int numbers[]={ 1,-2,6,-1,3};
MaxSubarraySum(numbers);
}
    
}
