import java.util.*;
// Demonstrates basic operations on a HashMap
public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();

        // Put - O(1)
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);

        System.out.println(map);

        // Get - O(1)
        // int population = map.get("India");
        // System.out.println("Value for key 'India': " + population);
        
        // int Indonesia = map.getOrDefault("Indonesia", 0);
        // System.out.println("Iterating over keys:" + Indonesia);

        // Contains Key - O(1)
        // System.out.println(map.containsKey("India"));  // true
        // System.out.println(map.containsKey("Indonesia"));  // false

        // Remove - O(1)
        // System.out.println(map.remove("China"));
        // System.out.println(map);

        // Size - O(1)
        System.out.println("Size of map: " + map.size());

        // Is Empty - O(1)
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty());
    
    }
}




