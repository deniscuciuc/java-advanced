package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] simpleArray = {"a", "e", "i", "o", "u"};

        /* If list is backed by a simple array we cant change structure
        *  We will occur UnsupportedOperationException
        */
        List<String> arrayInLists = Arrays.asList(simpleArray);

        arrayInLists.forEach(System.out::println);

        List<String> listSimple = new ArrayList<>();
        listSimple.add("Hello");
        listSimple.add("World");

        listSimple.forEach(System.out::println);

        listSimple.remove("World");

        listSimple.forEach(System.out::println);


        listSimple.clear();

        if (listSimple.isEmpty()) {
            System.out.println("List now is empty!");
        }

        listSimple.add("Hello");
        listSimple.add("World");


        // Convert from list to array
        String[] testString = new String[listSimple.size()];
        testString = listSimple.toArray(testString);
        System.out.println(Arrays.toString(testString));
    }
}
