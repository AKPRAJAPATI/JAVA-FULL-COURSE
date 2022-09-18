package Basics;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second;
        int totalNumber = 10;
        System.out.println("Enter first no");
        first = scanner.nextInt();
        System.out.println("Enter second no");
        second = scanner.nextInt();

        int res = first + second;
        System.out.println("Result is "+res);

        if (res > totalNumber)
        {
            for (int i= 1; i<=10; i++)
            {
                System.out.println(i*i);
            }

        }else{

            System.out.println("No is greatest ");
        }

    }
}
