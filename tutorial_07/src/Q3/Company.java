package Q3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Company {
    static final int MAXCAPACITY = 10;

    public static void main(String[] args) {
        Company cpny = new Company();
        int employeeCounter = 0;

        Employee[] listEmployee = new Employee[MAXCAPACITY];

        //Initialize a Scanner
        Scanner keyboard = new Scanner(System.in);
        int input;

        //first check if user wants to shop or see serialized output
        System.out.println("Please choose from one of the following options.");
        System.out.println("View serialized objects: 1");
        System.out.println("Use the company System: 2");
        input = keyboard.nextInt();
        keyboard.nextLine();
        if (input == 1) {
            int nbemployee = 0;
            listEmployee = cpny.readFromFile("CompanyRepertory.ser");
            if (listEmployee != null) {
                while (listEmployee[nbemployee] != null) {
                    System.out.println("the number of employee is " + nbemployee);
                    nbemployee++;
                }

                //int nbemployee= listEmployee.length;
                int pos = 0;

                Employee employee;
                if (nbemployee > 0) {
                    //System.out.println(employee);
                    while (pos < nbemployee) {
                        employee = listEmployee[pos];
                        System.out.println(employee);
                        pos++;
                    }
                }
            }
        } else if (input == 2) {
            System.out.println("*****Welcome to Company System***** \n");
            System.out.println("- Menu: ");
            System.out.println("1- Add a New Employee.");
            System.out.println("2- View employee(s) hired after a certain date.");
            System.out.println("0- Exit.");
            System.out.println("What would you like to do?");
            String choice = keyboard.nextLine();
            while (employeeCounter < listEmployee.length) {
                if (choice.equals("0")) {
                    int length = listEmployee.length;
                    int pos = 0;
                    System.out.println(length);
                    if (length > 0) {
                        Employee employee;
                        //System.out.println(employee);
                        while (pos < length) {
                            employee = listEmployee[pos];
                            if (employee == null)
                                break;
                            else {

                                System.out.println(employee);
                                pos++;
                            }

                        }
                    }
                    System.out.println("Thank you for using the Company System!");
                    //Store ListofOutfits in Serialization File
                    if (employeeCounter > 0)
                        cpny.writeToFile(listEmployee, employeeCounter);
                    break;
                }

                if (choice.equals("1")) {

                    System.out.println("Please enter the name of the employee");
                    String name = keyboard.nextLine();
                    //keyboard.nextLine();

                    System.out.println("Please enter the ID of the employee");
                    int id = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Please the position of the employee");
                    String position = keyboard.nextLine();
                    //keyboard.nextLine();
                    System.out.println("Please the day the employee was hired it should in the interval [1,31]");
                    int day = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Please the month the employee was hired it should in the interval [1,12]");
                    int month = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Please the year the employee was hired it should in the interval [1000,9999]");
                    int year = keyboard.nextInt();
                    keyboard.nextLine();
                    Date hiredDate = new Date(day, month, year);
                    Employee newEmployee = new Employee(name, id, hiredDate, position);
                    listEmployee[employeeCounter] = newEmployee;
                    employeeCounter++;
                }
                if (choice.equals("2")) {
                    System.out.println("You will now enter the specific date to retrieve all employees "
                            + "that were hired after this day");
                    System.out.println("Please the day it should in the interval [1,31]");
                    int day = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Please the month it should in the interval [1,12]");
                    int month = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Please the year it should in the interval [1000,9999]");
                    int year = keyboard.nextInt();
                    keyboard.nextLine();
                    Date thresholdDate = new Date(day, month, year);
                    if (employeeCounter == 0) {
                        listEmployee = cpny.readFromFile("CompanyRepertory.ser");
                        employeeCounter = listEmployee.length;
                    }
                    Employee[] selectedlistEmployee = cpny.getListEmployeeHired(thresholdDate, listEmployee, employeeCounter);

                    System.out.println("The list of employees hired after " + thresholdDate + " is:");
                    int nbselectedemployee = selectedlistEmployee.length;
                    for (int i = 0; i < nbselectedemployee; i++) {
                        Employee employee = listEmployee[i];
                        if (employee == null)
                            break;
                        else {

                            System.out.println(employee);
                        }
                    }
                    break;
                }

                System.out.println("- Menu: ");
                System.out.println("1- Add a New Employee.");
                System.out.println("2- View employee(s) hired after a certain date.");
                System.out.println("0- Exit.");
                System.out.println("What would you like to do?");

                choice = keyboard.nextLine();
            }
        }
        keyboard.close();
    }

    private Employee[] getListEmployeeHired(Date thresholdDate, Employee[] listEmployee, int employeeCounter) {
        // TODO Auto-generated method stub
        Employee[] selectedEmployee = new Employee[employeeCounter];
        int pos = 0;
        int posinselectlist = 0;
        Employee employee = listEmployee[pos];
        while (pos < employeeCounter && employee != null) {
            Date employeehiredDate = employee.getHiredDate();
            if ((employeehiredDate.getYear() >= thresholdDate.getYear()) &&
                    (employeehiredDate.getMonth() >= thresholdDate.getMonth()) &&
                    (employeehiredDate.getDay() >= thresholdDate.getDay())) {
                selectedEmployee[posinselectlist] = employee;
                posinselectlist++;
            }
            pos++;
        }
        return selectedEmployee;
    }

    private void writeToFile(Employee[] listEmployee, int employeeCounter) {

        if (employeeCounter > 0) {
            FileOutputStream fout = null;
            ObjectOutputStream out = null;
            File file = null;
            try {
                file = new File("CompanyRepertory.ser");

                fout = new FileOutputStream(file);


                out = new ObjectOutputStream(fout);
                // out.writeObject((Integer)employeeCounter );
                for (int i = 0; i < employeeCounter; i++)
                    out.writeObject(listEmployee[i]);

            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (EOFException e) {
                System.out.println("tets");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }


    private Employee[] readFromFile(String filename) {
        Employee[] listEmployee = null;
        FileInputStream fin = null;
        ObjectInputStream in = null;
        try {
            fin = new FileInputStream(filename);
            in = new ObjectInputStream(fin);
            //int numberOfEmployee= (Integer) in.readObject();
            listEmployee = new Employee[MAXCAPACITY];
            int pos = 0;
            while (true) {
                listEmployee[pos] = (Employee) in.readObject();
                pos++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is no database");
        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("No employees exist in database, you have to add some first!!!");
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return listEmployee;
    }
}