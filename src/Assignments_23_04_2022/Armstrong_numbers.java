package Assignments_23_04_2022;

import java.util.Scanner;

public class Armstrong_numbers {
    //Program to check the giving number is armstrong number or not from 1 to 999.
    public static void main(String[] args) {
        System.out.print("Please Enter the number which you want to check: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp =0, rem, sum =0;
        temp=num;
        while(num>0) {
            rem = num % 10;
            sum = sum+(rem * rem * rem);
            num = num/10;
        }
        if(temp==sum)
        {
            System.out.println("\nThe given number is armstrong number");
        }
        else {
            System.out.println("\nThe given number is not a armstrong number");
        }
    }
}
