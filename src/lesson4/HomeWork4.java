package lesson4;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 4
 * @author Andrey Hein
 * @version 23-Jan
 */

public class HomeWork4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your surname: ");
        String surname = in.nextLine();
        System.out.print("Enter your city: ");
        String city = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your height:");
        float height = in.nextFloat();
        System.out.printf("My name is %s %s, i am %d years old, my height is %.2f \n", name, surname, age, height);
        System.out.println("I live in " + city);
        in.close();
    }
}
