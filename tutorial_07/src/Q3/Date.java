package Q3;

import java.io.Serializable;

public class Date implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (dateOK(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Error your date value should respect the following"
                    + " conditions: year is between 1000 and 9999\n" +
                    " The day is between 1 and 31\n"
                    + "The month is between 1 and 12\n"
                    + " WE initialize it to default");
            this.day = 1;
            this.month = 1;
            this.year = 1900;
        }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else
            System.out.println(" The day should be between 1 and 31");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            System.out.println(" The month should be between 1 and 12");

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1000 && year <= 9999)
            this.year = year;
        else
            System.out.println(" The year should be between 1000 and 9999");
    }

    private boolean dateOK(int day2, int month2, int year2) {
        return ((day2 >= 1 && day2 <= 31) && (year2 >= 1000 && year2 <= 9999)
                && (month2 >= 1 && month2 <= 12));
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
