package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc_by_using_methods {
    //Program to create a calculator using methods statements for user input.
    public void choiceMethod() {
        System.out.println("\n Please select one of these options: 1 - addition, 2 - subtraction, 3 - multiplication, 4 - division");
    }

    public void additionMethod() {
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("\nPrint the addition of A & B: " + sum + "\n");            //Printing results
    }

    public void subtractionMethod() {
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int sub = a - b;
        System.out.println("\nPrint the subtraction of A & B: " + sub + "\n");        //Printing results
    }

    public void multiplicationMethod() {
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int mul = a * b;
        System.out.println("\nPrint the multiplication of A & B: " + mul + "\n");      //Printing results
    }

    public void divisionMethod() {
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        double a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        double b = scanner.nextInt();
        double div = a / b;
        System.out.println("\nPrint the division of A & B: " + div + "\n");           //Printing results
    }


    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);                                      //New Object for value flag value
        String flag="yes";
        do {
            Calc_by_using_methods obj = new Calc_by_using_methods();                    //New Object to get User Choice
            obj.choiceMethod();
            Scanner scanner3 = new Scanner(System.in);
            int choice = scanner3.nextInt();
            switch (choice) {                                                           //Methods calling by User's Choice

                case 1:
                    obj.additionMethod();
                    break;
                case 2:
                    obj.subtractionMethod();
                    break;
                case 3:
                    obj.multiplicationMethod();
                    break;
                case 4:
                    obj.divisionMethod();
                    break;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
            System.out.print("Do you wanna try another operation(yes/no) : ");          //Asking for User to try other operation
            Scanner scanner4 = new Scanner(System.in);
            flag = scanner4.next();
        }while(flag=="yes" || flag.equals("yes"));
    }
}                                                                                       // End Of Program.