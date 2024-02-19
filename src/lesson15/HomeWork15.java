package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 15
 * @author Andrey Hein
 * @version 18-Feb-2024
 */

public class HomeWork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("BMW X3", "white", 2020, 70);
        System.out.println(car.carMake + ", " + car.color + ", " + car.year + " year of manufacture");
        int action;
        int distance;
        do {
            System.out.println("1. Refuel the car");
            System.out.println("2. Start the motor");
            System.out.println("3. Start to the destination");
            System.out.println("4. Parking");
            System.out.print("Select action: ");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    car.refuel();
                    break;
                case 2:
                    car.startEngine();
                    break;
                case 3:
                    if (car.motor) {
                        System.out.print("Enter the distance to your destination (km): ");
                        distance = scanner.nextInt();
                        car.drive(distance);
                        break;
                    } else {
                        System.out.println("First start the motor!");
                        break;
                    }
                case 4:
                    car.motor = false;
                    System.out.println("The car is parked and motor stop.");
                    System.out.println("Good Bay !!!");
                    break;
            }
        } while (action != 4);
    }
}
