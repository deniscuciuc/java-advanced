package queue;

import java.util.ArrayDeque;

public class ArrayDequeueTest {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("animal");

        arrayDeque.addFirst("cow");
        System.out.println(arrayDeque);


        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

        arrayDeque.clear();

    }
}
