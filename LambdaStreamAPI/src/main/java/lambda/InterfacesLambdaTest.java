package lambda;

import java.util.Scanner;
import java.util.function.*;

public class InterfacesLambdaTest {
    public static void main(String[] args) {

        // predicate needs to verify conditions for variables
        Predicate<Integer> isPositive = x -> x > 0;


        // Predicate have only one method - test() : boolean
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));

        // BinaryOperator takes 2 objects T and execute binary operation on them
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(5, 5));

        // UnaryOperator takes object T, makes operations on it and return it after all
        UnaryOperator<Integer> square = x -> x * x;

        System.out.println(square.apply(5));


        // Function converting from T to R object
        Function<Integer, String> convertFromIntToString = x -> String.valueOf(x) + " dollars";
        System.out.println(convertFromIntToString.apply(25));

        // Consumer executes operations on object but returns void
        Consumer<Integer> printer = x -> System.out.printf("%d dollars \n", x);
        printer.accept(5);

        // Supplier returns object T
        Supplier<User> userSupplier = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userSupplier.get();
        User user2 = userSupplier.get();

        System.out.println(user1.getName());
        System.out.println(user2.getName());

    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
