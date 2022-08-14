package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        Random random = new Random();

        // generates 10 random numbers then adding them into arrayList
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(500));
        }

        // sorting using collection class
        Collections.sort(ints);
        System.out.println("Natural sorting: " + ints);

        // Soring with reverse
        ints.sort((o1, o2) -> {
            return (o2 - o1);
        });
        System.out.println("Reverse sorting: " + ints);

    }
}
