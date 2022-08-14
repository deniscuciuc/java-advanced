package queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayToQueue {
    public static void main(String[] args) {
        String[] nums = {"one", "two", "three", "four", "five"};
        Queue<String> queue = new LinkedList<>();


        // adding from nums in queue
        Collections.addAll(queue, nums);
        System.out.println(queue);

        String[] queueInArray = queue.toArray(new String[queue.size()]);
        System.out.println(Arrays.toString(queueInArray));
    }
}
