package Loops;

import java.util.Scanner;
//Program to Print Table of Any Number by User Input.
public class print_tables_using_for_loop {

    public static void main(String[] args) {
        int i;
        int a;
        String flag = "Y";

        while (flag == "Y" || flag.equals("Y")) {
            System.out.print("Please Enter number for printing the table: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("Let's Print Table of Two");

            for (i = 1; i <= 10; i++) {
                System.out.println(+a + " X " + i + " = " + a * i);
            }
            System.out.print("Do you wanna print another table  (Type Yes/No) : ");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();
        }
    }
}