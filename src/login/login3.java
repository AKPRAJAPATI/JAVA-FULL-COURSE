package login;

import java.util.Scanner;

public class login3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        System.out.println("Enter your email");
        email = scanner.next();
        System.out.println("Enter your password");
        password = scanner.next();

        if (!email.matches("ak@gmail.com"))
        {
            System.out.println("email is wrong");
        }else if (!password.matches("ak"))
        {
            System.out.println("Password is wrong");
        }else{
            System.out.println("Login Success");
        }

    }
}
