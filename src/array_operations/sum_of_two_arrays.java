package array_operations;

import java.util.Scanner;

public class sum_of_two_arrays {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        //array1
        System.out.println("Enter The Size of the 1st Array: ");
        int x = scanner.nextInt();
        int[] a1 = new int[x];
        System.out.println("Elements of 1st Array");
        for(i=0;i<x;i++) {
            a1[i]=scanner.nextInt();
        }

        //array2
        System.out.println("Enter The Size of 2nd Array: ");
        int y = scanner.nextInt();
        int[] a2 = new int[y];
        System.out.println("Elements of 2nd Array");
        for(i=0;i<y;i++) {
            a2[i]=scanner.nextInt();
        }
        System.out.println("Sum of Each Element of both array");
        int [] sum = new int[y];
        for(i=0;i<y;i++){
            sum[i] = a1[i] + a2[i];
        }
        for(int var:sum){
            System.out.println(var);
        }
    }


}


