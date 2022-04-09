package Loops;

public class print_tables_using_for_loop {
    public static void main(String[] args) {
        int i;
        int a = 2;
        System.out.println("Let's Print Table of Two");

        for (i = 1; i <= 10; i++) {
            System.out.println(+a + " X " + i + " = " + a * i);
            if (i == 5) {
                break;
            }
        }
    }
}