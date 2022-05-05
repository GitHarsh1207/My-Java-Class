package Collections.Hash_set;

import model.Employee_data;

import java.util.ArrayList;
import java.util.HashSet;

public class Employee_HashSet {
    public HashSet<Employee_data> employeeData() {

        HashSet<Employee_data> emp_list = new HashSet<>();

        Employee_data Employee1 = new Employee_data("Nitin Kumar", 1890, "HR", 27500);
        Employee_data Employee2 = new Employee_data("Rajat Singh", 1891, "Admin", 23000);
        Employee_data Employee3 = new Employee_data("Rajesh Kumar", 1892, "Admin", 17000);
        Employee_data Employee4 = new Employee_data("Naveen Sharma", 1893, "IT", 27500);
        Employee_data Employee5 = new Employee_data("Naveen Sharma", 1893, "IT", 27500);

        emp_list.add(Employee1);
        emp_list.add(Employee2);
        emp_list.add(Employee3);
        emp_list.add(Employee4);
        emp_list.add(Employee5);

        System.out.println("Print Size of Employee_Data : "+emp_list.size());
        return emp_list;
    }

    public static void main(String[] args) {
        Employee_HashSet object = new Employee_HashSet();

        HashSet<Employee_data> result = object.employeeData();

        for(Employee_data var : result){
            System.out.println("<<--Employees _ Record-->>  " + " Name: " + var.getName() + " Id_Number: " + var.getIdNumber() + " Department: " + var.getDepartment() + " Salary: " + var.getSalary());
        }
    }
}



