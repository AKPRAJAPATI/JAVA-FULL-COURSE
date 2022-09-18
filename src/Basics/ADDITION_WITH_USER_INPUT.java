package Basics;

import java.util.Scanner;

public class ADDITION_WITH_USER_INPUT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();

        c = a+b;
        System.out.println("Basics.Addition is "+c);
    }
}
