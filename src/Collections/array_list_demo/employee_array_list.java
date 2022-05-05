package Collections.array_list_demo;

import model.Employee_data;

import java.util.ArrayList;

public class employee_array_list {
    public ArrayList<Employee_data> emp_list() {
        ArrayList<Employee_data> emp_list = new ArrayList<>();

        Employee_data Employee1 = new Employee_data("Nitin Kumar", 1890, "HR", 27500);
        Employee_data Employee2 = new Employee_data("Rajat Singh", 1891, "Admin", 23000);
        Employee_data Employee3 = new Employee_data("Rajesh Kumar", 1892, "Admin", 17000);
        Employee_data Employee4 = new Employee_data("Naveen Sharma", 1893, "IT", 27500);

        emp_list.add(Employee1);
        emp_list.add(Employee2);
        emp_list.add(Employee3);
        emp_list.add(Employee4);

        return emp_list;
    }

    public static void main(String[] args) {
        employee_array_list obj = new employee_array_list();
        ArrayList<Employee_data>  List = obj.emp_list();
        for (Employee_data var : List) {
            System.out.println("\n----------------------------------");
            System.out.println("<<--Employees _ Record-->>  " + " Name: " + var.getName() + " Id_Number: " + var.getIdNumber() + " Department: " + var.getDepartment() + " Salary: " + var.getSalary());
        }
        System.out.println("\n after made some changes===================");
        for (Employee_data var:List) {
            if(var.getName().equals("Nitin Kumar")){          //.equals method is used to compare string data
                var.setName("Rahul Kumar");                   //changing in data like Nitin Kumar with Rahul Kumar
                if(var.getSalary() == 27500)                  //  and also the salary changed in 70000 instead of 27500
                    var.setSalary(70000);
            }
            System.out.println("<<--Employees _ Record-->>  " + " Name: " + var.getName() + " Id_Number: " + var.getIdNumber() + " Department: " + var.getDepartment() + " Salary: " + var.getSalary());
        }
    }
}



