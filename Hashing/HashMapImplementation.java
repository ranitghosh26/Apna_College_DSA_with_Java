import java.util.*;
public class HashMapImplementation {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node (K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            // this.N=0;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            } 
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }
        private int SearchInLL(int bi,K key){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //copy elements
            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll=oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = SearchInLL(bi, key);
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lambda = (double)n / N;
            if(lambda > 2.0){
                rehash();
            }

        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(bi,key);
            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(bi,key);
            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }
        public V get(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(bi,key);
            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }   
        public ArrayList <K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }


    }
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Nepal", 4);
        ArrayList<String> keys=map.keySet();
        for(String key:keys){
            // System.out.println("Key: "+key );
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            System.out.println(map.remove(key));
            System.out.println("Size of map: " + map.keySet().size());
        }

        

    }
}

