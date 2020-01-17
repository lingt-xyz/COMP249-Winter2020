package v2;

public class Driver {
    public static void main(String[] args) {
        Student b1 = new Student("ABC", "99", 'P');
        ClassHandler handler1 = new ClassHandler(b1);
        handler1.writeToFile("student.data");

        ClassHandler handler2 = new ClassHandler("student.data");
        Student b2 = handler2.getFromFile();
        System.out.println(b2);
    }
}
