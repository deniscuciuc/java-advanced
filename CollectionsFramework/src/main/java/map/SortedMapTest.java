package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
    public static void main(String[] args) {
        SortedMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("Two", 2);
        numbers.put("One", 1);

        System.out.println(numbers);

        System.out.println(numbers.firstKey());

        numbers.clear();
    }
}
