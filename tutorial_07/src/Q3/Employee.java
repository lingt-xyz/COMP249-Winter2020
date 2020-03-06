package Q3;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int ID;
    private Date hiredDate;
    private String position;

    public Employee(String name, int iD, Date hiredDate, String position) {
        //super();
        this.name = name;
        ID = iD;
        this.hiredDate = hiredDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return " the Employee " + name + " with ID=" + ID + " was hired on " + hiredDate + ". He has position=" + position;
    }

}
