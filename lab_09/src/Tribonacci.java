import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Requirements:
 * <p>
 * Create a Tribonacci class that has a recursive methods called tribonacciAtPosition()
 *
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class Tribonacci {

    private static final String FILE_PATH = "tribonacci.txt";

    /**
     * Requirements:
     * <p>
     * a) Takes the Tribonacci position (int) as a parameter.
     * b) Write the Tribonacci value of that position to a .txt file.
     * c) Makes a recursive call to itself until the Tribonacci value of the desired position is reached.
     * d) Write the entire Tribonacci sequence in series to a .txt
     * e) Append to the output file instead of writing over the data
     * <p>
     * Complexity is exponential.
     *
     * @param position a position of tribonacci number, starts from 0
     * @return Tribonacci number at the <code>position</code>
     */
    int tribonacciAtPosition(int position) {
        if (position < 2) {
            appendToFile(FILE_PATH, 0);
            return 0;
        } else if (position == 2) {
            appendToFile(FILE_PATH, 1);
            return 1;
        } else {
            int sum = tribonacciAtPosition((position - 3)) + tribonacciAtPosition((position - 2)) + tribonacciAtPosition((position - 1));
            appendToFile(FILE_PATH, sum);
            return sum;
        }
    }

    /**
     * Append the given number to the given file
     *
     * @param filePath the full path of the file
     * @param number   the number to be appended to the file
     */
    private void appendToFile(String filePath, int number) {
        try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(number);
        } catch (IOException e) {
            System.out.println("Cannot write to file " + filePath + ", got error: " + e.getMessage());
        }
    }
}
