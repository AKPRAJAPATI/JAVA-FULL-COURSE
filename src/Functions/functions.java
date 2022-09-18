package Functions;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        functions functions = new functions();

        System.out.println( "1 = Basics.Addition \n" +
                            "2 = Basics.Subtraction \n"+
                            "3 = Basics.Multiply \n"+
                            "4 = Devision");

        int one = 1;
        int two = 2;
        int three =3;
        int four = 4;
        int take;
        take = scanner.nextInt();

        if (take == one) {
            functions.Addition(10, 10);
        } else if (take == two) {
            functions.Subtraction(10, 10);
        }else if (take == three) {
            functions.Multiply(10, 10);
        }else if (take == four) {
            functions.Devision(10, 10);
        } else {
            System.out.println("NO Number is here");
        }

    }

    private void Addition(int i, int j) {
        int res = i + j;
        System.out.println("Res is " + res);
    }

    private void Subtraction(int i, int j) {
        int res = i - j;
        System.out.println("Res is " + res);
    }

     private void Devision(int i, int j) {
        int res = i / j;
        System.out.println("Res is " + res);
    }

    private void Multiply(int i, int j) {
        int res = i * j;
        System.out.println("Res is " + res);
    }


}
