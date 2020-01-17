package v1;

public class Book {
    private String name;
    private int page;
    private char category;

    public Book(String name, int page, char category){
        this.name = name;
        this.page = page;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public String toString(){
        return "name: " + this.name + ", page: " + this.page + ", category: " + this.category;
    }
}
