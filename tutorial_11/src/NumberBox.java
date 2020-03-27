/**
 * Generic Bounded Box class only allowing Numbers to be stored
 *
 * @param <T> the type of the value being boxed
 */
public class NumberBox<T extends Number> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public String toString() {
        return "This Number Box contains a " + this.t.getClass() + " with a value of " + this.get();
    }
}
