package v3;

import java.io.*;

public class ClassHandler {
    private Lab lab;
    private String path;

    public ClassHandler(Lab lab) {
        this.lab = lab;
    }

    public ClassHandler(String path) {
        this.path = path;
    }

    public void writeToFile(String fileName) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(fileName));
            pw.println(this.lab.getSection());
            pw.println(this.lab.getCapacity());
            pw.println(this.lab.isFull());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public Lab getFromFile() {
        BufferedReader readerObject = null;
        try {
            readerObject = new BufferedReader(new FileReader(this.path));
            String section = readerObject.readLine();
            String capacity = readerObject.readLine();
            String fullString = readerObject.readLine();
            return new Lab(section, Integer.parseInt(capacity), fullString.equals("true")? true: false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (readerObject != null) {
                try {
                    readerObject.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
