package v2;

public class Student {
    private String name;
    private String id;
    private char grade;

    public Student(String name, String id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String toString(){
        return "name: " + this.name + ", id: " + this.id + ", grade: " + this.grade;
    }
}
