package list;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("hello");
        stringStack.push("world");
        System.out.println(stringStack);

        stringStack.pop();

        System.out.println(stringStack);

        stringStack.push("world");
        String peekedString = stringStack.peek();

        System.out.println(peekedString);

        int positionHello = stringStack.search("hello");
        System.out.println(positionHello);

        // recommended to use arrayDeque
    }
}
