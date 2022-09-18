package one_d_two_d_array;

import java.util.Scanner;

public class double_dimension_array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Double Dimensional array");
        int array[][] = new int[3][3];
        System.out.println("Enter 9 value in your array ");

        for (int i = 0; i <= 2; i++)
        for (int j = 0; j <= 2; j++)
        array[i][j] = scanner.nextInt();

        System.out.println("Elements is given below ");


        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
