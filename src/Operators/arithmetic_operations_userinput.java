package Operators;

import java.util.Scanner;

public class arithmetic_operations_userinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);            //New Object for reading user input
        String flag="yes";
        do {
        System.out.print("Please Enter the value of A: ");
        int a = scanner.nextInt();                           // for reading & storing value of a.
        System.out.print("Please Enter the value of B2: ");
        int b = scanner.nextInt();                           // for reading & storing value of b.
        int sum = a + b, sub = a - b, mul = a * b;
        double div = a / b;

            System.out.println("Please select one operation listed below");
            System.out.println("\n--------------------------------");
            System.out.println("Please type sum for addition");
            System.out.println("Please type sub for subtraction");
            System.out.println("Please type mul for multiplication");
            System.out.println("Please type div for division");
            Scanner scanner2 = new Scanner(System.in);            //New Object for reading user input
            String Choice = scanner2.nextLine();
            if (Choice == "sum" || Choice.equals("sum")) {
                System.out.println("The sum of the value of a & b = " + sum);
            } else if (Choice == "sub" || Choice.equals("sub")) {
                System.out.println("The sub of the value of a & b = " + sub);
            } else if (Choice == "mul" || Choice.equals("mul")) {
                System.out.println("The mul of the value of a & b = " + mul);
            } else if (Choice == "div" || Choice.equals("div")) {
                System.out.println("The div of the value of a & b = " + div);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Do you want to try another operation:");
            Scanner scanner3 = new Scanner(System.in);
            flag = scanner3.next();
        }
        while(flag=="yes" || flag.equals("yes"));
    }
}

