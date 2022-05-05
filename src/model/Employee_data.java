package model;

public class Employee_data {
    // This is a model class that used to access and entities objects.
    String Name;
    int idNumber;
    String department;
    double salary;


    //Now create parameterized constructor


    public Employee_data(String name, int idNumber, String department, double salary) {
        Name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {                                                   //getter method to get data
        return Name;
    }

    public void setName(String name) {                                          //setter method to set/modify data
        Name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

