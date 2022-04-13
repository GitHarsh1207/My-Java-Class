package Class_and_Objects;

public class parameterized_constructor_demo {
String Name;
String Department;
int idNumber;
int Salary;
                //parameterized constructor


    public parameterized_constructor_demo(String name, String department, int idNumber, int salary) {
        Name = name;
        Department = department;
        this.idNumber = idNumber;
        Salary = salary;
    }
    public static void main(String[] args) {
    parameterized_constructor_demo Employee1 = new parameterized_constructor_demo("Rakesh","Sales",2348,50000);
        parameterized_constructor_demo Employee2 = new parameterized_constructor_demo("Abhilash","Media",2349,41000);
        parameterized_constructor_demo Employee3 = new parameterized_constructor_demo("Sourabh","Marketing",2350,38000);
        System.out.println("\n-----------------------------Employee1 Data");
        System.out.println("Employee Name: " +Employee1.Name);
        System.out.println("Employee Department: " +Employee1.Department);
        System.out.println("Employee ID Number: " +Employee1.idNumber);
        System.out.println("Employee Salary: " +Employee1.Salary);
        System.out.println("\n-----------------------------Employee2 Data");
        System.out.println("Employee Name: " +Employee2.Name);
        System.out.println("Employee Department: " +Employee2.Department);
        System.out.println("Employee ID Number: " +Employee2.idNumber);
        System.out.println("Employee Salary: " +Employee2.Salary);
        System.out.println("\n-----------------------------Employee3 Data");
        System.out.println("Employee Name: " +Employee3.Name);
        System.out.println("Employee Department: " +Employee3.Department);
        System.out.println("Employee ID Number: " +Employee3.idNumber);
        System.out.println("Employee Salary: " +Employee3.Salary);
        parameterized_constructor_demo Doctor1 = new parameterized_constructor_demo("Harsh","E&T",1467,75000);
        parameterized_constructor_demo Doctor2 = new parameterized_constructor_demo("Yash","Neurology",1578,88000);
        parameterized_constructor_demo Doctor3 = new parameterized_constructor_demo("Bhupendra Singh","Surgery",2146,100000);
        System.out.println("\n=============Doctor's Data==================");
        System.out.println("\n-----------------------------Doctor1 Data");
        System.out.println("Doctor Name: " +Doctor1.Name);
        System.out.println("Doctor Department: " +Doctor1.Department);
        System.out.println("Doctor ID Number: " +Doctor1.idNumber);
        System.out.println("Doctor Salary: " +Doctor1.Salary);
        System.out.println("\n-----------------------------Doctor2 Data");
        System.out.println("Doctor Name: " +Doctor2.Name);
        System.out.println("Doctor Department: " +Doctor2.Department);
        System.out.println("Doctor ID Number: " +Doctor2.idNumber);
        System.out.println("Doctor Salary: " +Doctor2.Salary);
        System.out.println("\n-----------------------------Doctor3 Data");
        System.out.println("Doctor Name: " +Doctor3.Name);
        System.out.println("Doctor Department: " +Doctor3.Department);
        System.out.println("Doctor ID Number: " +Doctor3.idNumber);
        System.out.println("Doctor Salary: " +Doctor3.Salary);
    }
}
