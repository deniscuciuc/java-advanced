package types;

/**
 * T is a type variable
 * The most commonly used type parameter names are:
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 * @param <T>
 */
public class GenericBox<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
