package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {

        // usefully in concurrent
        BlockingQueue<String> blockingQueueArray = new ArrayBlockingQueue<>(3);


        BlockingQueue<String> blockingQueueLinked = new LinkedBlockingQueue<>(4);

        blockingQueueArray.add("1");
        blockingQueueArray.add("1");
        blockingQueueArray.add("1");
        System.out.println(blockingQueueArray);
    }
}
