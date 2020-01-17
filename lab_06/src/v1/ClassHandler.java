package v1;

import java.io.*;

public class ClassHandler {

    private Book book;
    private String path;

    public ClassHandler(Book book) {
        this.book = book;
    }

    public ClassHandler(String path) {
        this.path = path;
    }

    public void writeToFile(String fileName) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(fileName));
            pw.println(this.book.getName());
            pw.println(this.book.getPage());
            pw.println(this.book.getCategory());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public Book getFromFile() {
        BufferedReader readerObject = null;
        try {
            readerObject = new BufferedReader(new FileReader(this.path));
            String name = readerObject.readLine();
            String ageString = readerObject.readLine();
            String categoryString = readerObject.readLine();
            return new Book(name, Integer.parseInt(ageString), categoryString.charAt(0));
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
