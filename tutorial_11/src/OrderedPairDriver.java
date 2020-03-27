import java.util.*;

public class OrderedPairDriver {
    public static void main(String args[]) {
        OrderedPair<Integer, String> myPair = new OrderedPair<Integer, String>();

        myPair.setFirst(new Integer(1));
        myPair.setSecond(new String("So much depends on a red wheelbarrow"));
        System.out.println(myPair);

        OrderedPair<String, OrderedPair<Integer, String>> dawg = new OrderedPair<String, OrderedPair<Integer, String>>();
        dawg.setFirst(new String("Yo dawg!"));
        dawg.setSecond(myPair);
        System.out.println(dawg);
    }
}
