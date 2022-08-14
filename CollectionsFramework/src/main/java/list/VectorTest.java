package list;


import java.lang.reflect.Type;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> mammals = new Vector<>();

        mammals.add("dog");
        mammals.add("horse");

        mammals.add(1, "cat");
        System.out.println(mammals);

        mammals.remove(1);

        mammals.clear();

        System.out.println(mammals);


    }
}
