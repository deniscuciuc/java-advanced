package types;

public class TestMain {

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();


        Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<>("Hello", "World");


    }
}
