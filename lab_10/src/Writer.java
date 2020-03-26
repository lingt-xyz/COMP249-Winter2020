import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    
    /**
     * Append the given content to the given file
     *
     * @param filePath the full path of the file
     * @param content  the content to be appended to the file
     */
    public static void AppendToFile(String filePath, String content) {
        try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(content);
        } catch (IOException e) {
            System.out.println("Cannot write to file " + filePath + ", got error: " + e.getMessage());
        }
    }
}
