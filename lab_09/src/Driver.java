import java.util.Random;

/**
 * Requirements:
 *
 * Create a Driver class to test your program. Use a randomly generated integer (from 5 to
 * 10) as the position to find the Tribonacci sequence up to that position.
 */
public class Driver {

    public static void main(String[] args) {
        Tribonacci t = new Tribonacci();
        int position = new Random().nextInt(5) + 5;
        int sum = t.tribonacciAtPosition(position);
        System.out.println("Tribonacci[" + position + "] = " + sum);
    }
}
