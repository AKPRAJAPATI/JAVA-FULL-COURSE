package Basics;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname,lastname;

        System.out.println("Enter first name");
        firstname = scanner.next();
        System.out.println("Enter first lastname");
        lastname = scanner.next();

        System.out.println("Your name is "+firstname +" "+ lastname);


    }
}
