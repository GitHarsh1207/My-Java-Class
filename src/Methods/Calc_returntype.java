package Methods;

import java.util.Scanner;

public class Calc_returntype {
    public void choiceMethod() {
        System.out.println("\n Please select one of these options: 1 - addition, 2 - subtraction, 3 - multiplication, 4 - division");

    }
    public int addition(){                                                    //return type int declare
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int sum = a + b;
        return sum;                                                             //return sum as int.
    }
    public int subtraction(){                                                    //return type int declare
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int sub = a - b;
        return sub;                                                             //return sub as int.
    }
    public int multiplication(){                                                    //return type int declare
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int mul = a * b;
        return mul;                                                             //return mul as int.
    }
    public int division(){                                                    //return type int declare
        Scanner scanner = new Scanner(System.in);                             //New Object for reading user input
        System.out.print("Please Enter the Value of A: ");                    // for reading & storing value of a.
        int a = scanner.nextInt();
        System.out.print("Please Enter the Value of B: ");                    // for reading & storing value of b.
        int b = scanner.nextInt();
        int div = a / b;
        return div;                                                             //return div as int.
    }

    public static void main(String[] args) {
        Calc_returntype result = new Calc_returntype();
        int ans1 = result.addition();
        System.out.println("The addition of A & B : "+ans1);
        int ans2 = result.subtraction();
        System.out.println("The addition of A & B : "+ans2);
        int ans3 = result.multiplication();
        System.out.println("The addition of A & B : "+ans3);
        int ans4 = result.division();
        System.out.println("The addition of A & B : "+ans4);

    }
}
