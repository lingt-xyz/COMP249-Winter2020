package v3;

public class Lab {
    private String section;
    private int capacity;
    private boolean full;

    public Lab(String section, int capacity, boolean full) {
        this.section = section;
        this.capacity = capacity;
        this.full = full;
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

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String toString(){
        return "section: " + this.section + ", capacity: " + this.capacity + ", full: " + (this.full ? "yes": "no");
    }
}
