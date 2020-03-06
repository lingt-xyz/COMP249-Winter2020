package Q2;

import java.io.*;
import java.util.*;

public class ReadAsciiFile {

    public static void main(String[] args) {
        Scanner inputStream = null;
        String namefile = "Intfile.txt";
        try {
            inputStream = new Scanner(new FileInputStream(namefile));
            if (inputStream.hasNextInt()) {
                int min = inputStream.nextInt();
                int max = min;
                double sum = min;
                int nbelm = 1;
                while (inputStream.hasNextInt()) {
                    int temp = inputStream.nextInt();
                    if (temp < min) {
                        min = temp;
                    }
                    if (temp > max) {
                        max = temp;
                    }
                    sum += temp;
                    nbelm++;
                }
                System.out.println("The min is " + min);
                System.out.println("The max is " + max);
                System.out.println("The mean is  " + sum / nbelm);
                inputStream.close();
            } else {
                System.out.println("The file is empty");
                System.exit(0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file" + namefile + " does not exist");
            System.out.println("or could not be opened");
            System.exit(0);
        } catch (IllegalStateException e) {
            System.out.println("Problem trying to read the file");
        }

    }
}
