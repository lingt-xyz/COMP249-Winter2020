package v3;

public class Driver {
    public static void main(String[] args) {
        Lab b1 = new Lab("ABC", 99, true);
        ClassHandler handler1 = new ClassHandler(b1);
        handler1.writeToFile("lab.data");

        ClassHandler handler2 = new ClassHandler("lab.data");
        Lab b2 = handler2.getFromFile();
        System.out.println(b2);
    }
}
