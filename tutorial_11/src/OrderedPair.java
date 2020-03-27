/**
 * Generic version of an OrderedPair class
 *
 * @param <T> the type of the first value
 * @param <S> the type of the second value
 */
public class OrderedPair<T, S> {
    private T first;
    private S second;

    public void setFirst(T val) {
        this.first = val;
    }

    public void setSecond(S val) {
        this.second = val;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public String toString() {
        return "This OrderedPair contains a " + this.first.getClass() + " with a value of " + this.getFirst()
                + " and a " + this.second.getClass() + " with a value of " + this.getSecond();
    }
}
