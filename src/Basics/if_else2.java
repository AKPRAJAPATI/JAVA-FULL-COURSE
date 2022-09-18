package Basics;

import java.util.Scanner;

public class if_else2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int i = scanner.nextInt();
        System.out.println("Enter second number");
        int j = scanner.nextInt();

        if (i<j)
        {
            System.out.println("i less then j");
        }else{
            System.out.println("i greater than j");
        }
    }
}
