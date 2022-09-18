package try_catch;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a, b,c;
            System.out.println("Enter first number");
            a = scanner.nextInt();
            System.out.println("Enter second number");
            b = scanner.nextInt();

            c = a+b;
            System.out.println("addition is "+c);
        } catch (Exception e) {
            System.out.println("error is "+e.getMessage());
            throw new RuntimeException(e);

        }
    }

}
