import java.util.*;
public class IterationHashSets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");

        // Iterating using Iterator
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+it.next());
        }

        // Iterating using for-each loop
        for(String fruit : set){
            System.out.println("for-each loop : "+fruit);
        }
    }
}
