package v1;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book("ABC", 99, 'P');
        ClassHandler handler1 = new ClassHandler(b1);
        //handler1.writeToFile("book.data");

        ClassHandler handler2 = new ClassHandler("book.data");

        Book b2 = handler2.getFromFile();
        System.out.println(b2);
    }
}
