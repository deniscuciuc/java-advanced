package methods;

import types.OrderedPair;
import types.Pair;

public class TestMain {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new OrderedPair<>(1, "Apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "Pear");
        boolean same = Util.compare(p1, p2);
    }
}
