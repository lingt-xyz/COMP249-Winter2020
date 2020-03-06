package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try {
            Scanner inOldMaster = new Scanner(new File("oldmast.txt"));
            System.out.println(inOldMaster.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter("oldmast.txt", true);
            writer.append("ABC");
            writer.flush();
        } catch (IOException e) {
        }
    }
}
