/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public String toString() {
        return "This Box contains a " + this.t.getClass() + " with a value of " + this.get();
    }
}
