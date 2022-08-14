package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println(numbers);


        System.out.println("Keys: " + numbers.keySet());

        System.out.println("Values: " + numbers.values());

        System.out.println("Entries: " + numbers.entrySet());

        int valueRemoved = numbers.remove("One");
        System.out.println("Removed: " + valueRemoved);

        numbers.replace("Two", 4);
        System.out.println(numbers);
    }
}
