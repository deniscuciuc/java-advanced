package lambda;

public class TestLambda {
    public static void main(String[] args) {
        OperationAble operation1 = ((x, y) -> x + y);
        OperationAble operation2 = ((x, y) -> x - y);
        OperationAble operation3 = ((x, y) -> x * y);


        System.out.println(operation1.calculate(10, 20));
        System.out.println(operation2.calculate(30, 20));
        System.out.println(operation3.calculate(50, 1));


        OperationAble operation4 = ((x, y) -> {
            if (y == 0) {
                return 0;
            } else {
                return x / y;
            }
        });

        System.out.println(operation4.calculate(4, 2));

        GenericOperationAble<String> stringGenericOperationAble = (x, y) -> x + y;
        GenericOperationAble<Integer> integerGenericOperationAble = (x, y) -> x + y;

        System.out.println(integerGenericOperationAble.calculate(20, 10));
        System.out.println(stringGenericOperationAble.calculate("20", "10"));
    }
}

interface OperationAble {
    int calculate(int x, int y);
}

interface GenericOperationAble<T> {
    T calculate(T x, T y);
}