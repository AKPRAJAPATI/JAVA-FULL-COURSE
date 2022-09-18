package Mathe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculate_circle_area {
    public static void main(String[] args) {
        int radius = 0;
        System.out.println("Enter radius of a circle");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            radius = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error is "+e.getMessage());
            throw new RuntimeException(e);
        }

        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle is "+area);
    }
}
