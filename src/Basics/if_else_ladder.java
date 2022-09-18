package Basics;

public class if_else_ladder {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("This is first");
            } else if (i == 2) {
                System.out.println("This is second");
            } else if (i == 3) {
                System.out.println("This is third");
            } else if (i == 4) {
                System.out.println("This is fourth");
            } else {
                System.out.println("This is fifth");
            }

        }
    }
}
