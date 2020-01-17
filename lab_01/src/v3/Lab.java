package v3;

public class Lab {
    private String section;
    private int capacity;
    private char semester;

    public Lab(){
        this.section = null;
        this.capacity = 0;
        this.semester = ' ';
    }

    public Lab(String section, int capacity, char semester){
        this.section = section;
        this.capacity = capacity;
        if(validate(semester)) {
            this.semester = semester;
        }else{
            this.semester = ' ';
        }
    }

    public Lab(Lab lab){
        this.section = lab.section;
        this.capacity = lab.capacity;
        if(validate(lab.semester)) {
            this.semester = lab.semester;
        }else{
            this.semester = ' ';
        }
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public char getSemester() {
        return semester;
    }

    public void setSemester(char semester) {
        if(validate(semester)) {
            this.semester = semester;
        }else{
            this.semester = ' ';
        }
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Lab){
            Lab lab = (Lab)o;
            return this.section.equals(lab.section) && this.semester == lab.semester;
        }
        return false;
    }

    public String toString(){
        return "Lab: section: " + this.section + ", capacity: " + this.capacity + ", semester: " + this.semester;
    }

    private static boolean validate(char c){
        if(c == 'w' || c == 's' || c=='f'){
            return true;
        }else{
            System.out.println("Invalidate semester.");
            return false;
        }
    }
}
