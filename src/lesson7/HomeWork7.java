package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 7
 * @author Andrey Hein
 * @version 30-Jan-2024
 */

public class HomeWork7 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner in = new Scanner(System.in);
        double speed, angle, range;
        boolean enter, repeat = true;
        int counter = 0;
        int target = rn.nextInt(990)+ 10;   //  Target from 10 to 1000 meter
        do {
            counter++;
            do {
                System.out.print("Enter shot angle (1º - 89º): ");
                angle = in.nextInt();
                enter = (angle > 0 && angle < 90);
                if (!enter) {
                    System.out.println("Wrong! Try again!");
                }
            } while (!enter);
            do {
                System.out.print("Enter shot speed (1 m/s - 100 m/s): ");
                speed = in.nextInt();
                enter = (speed > 0 && speed < 101);
                if (!enter) {
                    System.out.println("Wrong! Try again!");
                }
            } while (!enter);

            // Calculate range of shot in meters

            range = (speed * speed * Math.sin(2 * Math.toRadians(angle)) / 10);
            Integer difference = (int)Math.round(range) - target;
            if (difference >= -50 && difference <= 50) {     // Damage radius is 100 meters
                System.out.println("Congratulations!!! You destroy the target for " + counter + " attempts!");
                System.out.println("Target was " + target + " meters; You shot was " + (int)range + " meters");
                repeat = false;
            } else if(difference < 0){
                System.out.println("Undershot is " + difference + " meters. Try again.");
                repeat = true;
            } else {
                System.out.println("Shot out in " + difference + " meters. Try again.");
                repeat = true;
            }
        } while (repeat);
    }
}
