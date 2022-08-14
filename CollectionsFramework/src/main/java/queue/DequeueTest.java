package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueTest {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();

        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println(numbers);

        numbers.pollFirst();

        System.out.println(numbers);

    }
}
