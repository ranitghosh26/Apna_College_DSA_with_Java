public class LinearSearch {

    public static int LinearSearch(int numbers[],int key){

        for(int i=1; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        
         int key=10;
       

        
        int index=LinearSearch( numbers ,key);
        if (index==-1) {
            System.out.println("Key is not found");

            
        }else{
            System.out.println("Key is at index : "+index);
        }





        
        
    }
    
    
}
