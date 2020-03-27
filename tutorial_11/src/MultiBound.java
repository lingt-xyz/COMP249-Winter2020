/**
 * Generic with multiple bounds
 *
 * @param <T> the type of the value being boxed
 */
public class MultiBound<T extends Shape & ShapeInterface> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public String toString() {
        return this.t.printShape();
    }
}
