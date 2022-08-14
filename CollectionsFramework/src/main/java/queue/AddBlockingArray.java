package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AddBlockingArray {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);

        System.out.println(blockingQueue.add("one"));
        System.out.println(blockingQueue.add("two"));
        System.out.println(blockingQueue);

        System.out.println(blockingQueue.element());

        blockingQueue.poll();

        System.out.println(blockingQueue);

        blockingQueue.clear();

        // peek return null if no head available
        System.out.println(blockingQueue.peek());

        /* // causes exception
        System.out.println(blockingQueue.add("three"));
        System.out.println(blockingQueue);*/
    }
}
