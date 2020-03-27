import java.util.*;

public class MultiBoundDriver {
    public static void main(String args[]) {
        MultiBound<Rectangle> myShape = new MultiBound<Rectangle>();
        myShape.set(new Rectangle(10, 10));
        System.out.println(myShape);
    }
}
