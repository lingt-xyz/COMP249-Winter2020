package v2;

import java.io.*;

public class ClassHandler {
    private Student student;
    private String path;

    public ClassHandler(Student student) {
        this.student = student;
    }

    public ClassHandler(String path) {
        this.path = path;
    }

    public void writeToFile(String fileName) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(fileName));
            pw.println(this.student.getName());
            pw.println(this.student.getId());
            pw.println(this.student.getGrade());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public Student getFromFile() {
        BufferedReader readerObject = null;
        try {
            readerObject = new BufferedReader(new FileReader(this.path));
            String name = readerObject.readLine();
            String id = readerObject.readLine();
            String gradeString = readerObject.readLine();
            return new Student(name, id, gradeString.charAt(0));
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
