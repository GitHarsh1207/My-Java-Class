package Assignments_23_04_2022;

import java.util.Scanner;
// Program to swapping of values without using 3rd variable.

public class Swapping_without_3rd_variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.print("Please Enter the value of B: ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter Swapping The Value of A & B");
        System.out.println("New value of A: "+a);
        System.out.println("New value of B: "+b);
    }
}
