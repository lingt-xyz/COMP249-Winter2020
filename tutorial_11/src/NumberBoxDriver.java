import java.util.*;

public class NumberBoxDriver {
    public static void main(String[] args) {
        NumberBox<Integer> myIntegerBox = new NumberBox<Integer>();

        myIntegerBox.set(new Integer(10));
        System.out.println(myIntegerBox);

        // This will result in a compile time error:
//        NumberBox<String> myStringBox = new NumberBox<String>();
//        myStringBox.set(new String("I am not a Number!"));
//        System.out.println(myStringBox);
    }
}
