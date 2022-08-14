package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Iterator<Integer> integerIterator = list.iterator();

        // iterating with iterator
        while (integerIterator.hasNext()) {
            int i = (int) integerIterator.next();
            System.out.println(i + ", ");
        }

        System.out.println("\n " + list);

    }
}
