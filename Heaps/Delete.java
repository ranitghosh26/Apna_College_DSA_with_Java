import java.util.*;
public class Delete {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            // bubble up
            while (x > 0 && arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int l = 2*i+1;
            int r= 2*i+2;
            int minIdx=i;

            if(l<arr.size() && arr.get(minIdx)>arr.get(l)){
                minIdx=l;
            }
            if(r<arr.size() && arr.get(minIdx)>arr.get(r)){
                minIdx=r;
            }
            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }


        public int remove(){
            int data = arr.get(0);

            // step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step2 - remove last element
            arr.remove(arr.size()-1);

            // step3 - heapify
            if (!arr.isEmpty()) heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        // You can create and use Heap here if needed
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5); 
        
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
