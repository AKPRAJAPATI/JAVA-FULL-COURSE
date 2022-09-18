package ADVANCE_LEVEL.oops;

import java.util.Scanner;

public class bike {
    public void bikeName() {
        System.out.println("Hero Honda");
    }

    public void bikeModel() {
        System.out.println("2016");
    }

    public void bikeWheel() {
        System.out.println("2 Wheel");
    }

    public void bikeOil() {
        System.out.println("Petrol");
    }

    public void bikeInsourence() {
        System.out.println("No");
    }

    public void bikePrice() {
        System.out.println("1000000");
    }
}

class showDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getNumber ;
        bike bikes = new bike();
        System.out.println("1. Bikename \n " +
                "2. BikeModel \n " +
                "3. Bike Wheel \n" +
                "4. Bike Oil \n " +
                "5. Bike insourence \n " +
                "6. Bike Price \n ");

        getNumber = scanner.nextInt();

        if (getNumber == 1) {
            bikes.bikeName();

        } else if (getNumber == 2) {
            bikes.bikeModel();

        } else if (getNumber == 3) {
            bikes.bikeWheel();

        } else if (getNumber == 4) {
            bikes.bikeOil();

        } else if (getNumber == 5) {
            bikes.bikeInsourence();

        } else if (getNumber == 6) {
            bikes.bikePrice();

        } else {
            System.out.println("Not found");
        }
    }
}

