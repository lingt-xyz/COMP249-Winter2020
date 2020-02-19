package v1;

public class Book {
    private String name;
    private int bookNum;
    private static int bookCount;

    public Book() {
        this.name = null;
        this.bookNum = 0;
    }

    public Book(String name, int bookNum, int bookCount) {
        this.name = name;
        this.bookNum = bookNum;
        Book.bookCount = bookCount;
    }

    public Book(Book book) {
        this.name = book.name;
        this.bookNum = book.bookNum;
        Book.bookCount = book.bookCount;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o instanceof Book){
            Book book = (Book)o;
            return this.name.equals(book.name) && this.bookNum == book.bookNum;
        }
        return false;
    }

    public String toString(){
        return "Book: name: " + this.name + ", bookNum: " + this.bookNum + ", bookCount: " + Book.bookCount;
    }
}
