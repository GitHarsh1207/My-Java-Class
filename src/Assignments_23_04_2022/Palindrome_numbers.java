package Assignments_23_04_2022;

import java.util.Scanner;

public class Palindrome_numbers {
    // Program to Check the giving number is Palindrome or Not.

    public static void main(String[] args) {
        System.out.print("Please Enter Any Number for check: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0, rem, rev=0;
        temp=num;

        while(num>0){
            rem = num % 10;
            rev = rem+ rev*10;
            num = num / 10;
        }
        if(temp==rev) {
            System.out.println("\nThe given number is Palindrome");
        }
        else{
            System.out.println("\nThe given number is not Palindrome");
        }
    }
}
