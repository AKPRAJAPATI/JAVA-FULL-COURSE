package login;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        System.out.println("Enter your email");
        email = scanner.next();
        System.out.println("Enter your password");
        password = scanner.next();

        if (!(email.compareTo("akash@gmail.com") == 0))
        {
            System.out.println("Email is wrong");
        }else if (password.compareTo("akashkumar") == 0)
        {
            System.out.println("Password is wrong");
        }else if (email.compareTo("akash@gmail.com") == password.compareTo("akashkumar")){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }

    }
}
