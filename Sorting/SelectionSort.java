public class SelectionSort {

    public  static void SelectionSort( int arr[]){
        int n=arr.length;
        for( int i=0; i<n-1;i++){
            int minPos=i;
            for( int j=i+1; j<n-1;j++){
                if (arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    


    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        SelectionSort(arr);
        printArr(arr);
                
            
        }
    }
        
        
        

