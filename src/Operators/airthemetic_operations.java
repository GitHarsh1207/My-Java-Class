package Operators;

import java.util.Scanner;

public class airthemetic_operations {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);            //New Object for reading user input

        System.out.println("Please Enter the value of A: ");
        int a =scanner.nextInt();                           // for reading & storing value of a.
        System.out.println("Please Enter the value of A: ");
        int b =scanner.nextInt();                           // for reading & storing value of b.

        int sum = a+b, sub = a-b, mul = a*b;
        double div =a/b;

        System.out.println("Please select one operation listed below");
        System.out.println("\n--------------------------------");
        System.out.println("Please type sum for addition");
        System.out.println("Please type sub for subtraction");
        System.out.println("Please type mul for multiplication");
        System.out.println("Please type div for division");
        System.out.println("\n");
        Scanner scanner1= new Scanner(System.in);            //New Object for reading user input
        String Choice = scanner1.nextLine();

        if(Choice=="sum" || Choice.equals("sum")){
            System.out.println("The sum of the value of x & y = "+sum);
        }
        else if(Choice=="sub" || Choice.equals("sub")){
            System.out.println("The sub of the value of x & y = "+sub);
        }
        else if(Choice=="mul" || Choice.equals("mul")){
            System.out.println("The mul of the value of x & y = "+mul);
        }
        else if(Choice=="div" || Choice.equals("div")){
            System.out.println("The div of the value of x & y = "+div);
        }
    }
}
