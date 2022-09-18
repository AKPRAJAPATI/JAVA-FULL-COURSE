package ADVANCE_LEVEL.oops.encapsulation;

import java.util.Scanner;

public class encapsulation {
    Scanner scanner = new Scanner(System.in);

    float p;
    float r;
    float s;
    float c;

    void getPara()
    {
        System.out.println("Enter principle");
        p = scanner.nextInt();
        System.out.println("Enter rate of intrest");
        r= scanner.nextInt();
        System.out.println("Enter time duration");
        s = scanner.nextInt();
    }
    void findIntrest()
    {
        c = (p*r*s)/100;
    }
    void show()
    {
        System.out.println("Res is "+c);
    }

    public static void main(String[] args) {
        encapsulation encapsulation =new encapsulation();
        encapsulation.getPara();
        encapsulation.findIntrest();
        encapsulation.show();
    }
}
