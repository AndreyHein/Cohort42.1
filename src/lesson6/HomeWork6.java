package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 6
 * @author Andrey Hein
 * @version 28-Jan-2024
 */

public class HomeWork6 {
    public static void main(String[] args) {

        // Task #1

        Scanner in = new Scanner(System.in);
        String log;
        int num;
        do {
            System.out.print("Enter number 1 or 2 or 3: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    System.out.println("You entered number ONE.");
                    break;
                case 2:
                    System.out.println("You entered number TWO.");
                    break;
                case 3:
                    System.out.println("You entered number THREE.");
                    break;
                default:
                    System.out.println("Incorrectly entered number!");
            }

            System.out.print("Exit? (Y/N) ");
            log = in.next();
        } while (log.equals("N") || log.equals("n"));

        // Task #2

        do {
            System.out.print("Enter integer number from 1 to 7: ");
            int numDay = in.nextInt();
            switch (numDay) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
                    default:
                    System.out.println("Incorrectly entered number!");
            }
            System.out.print("Exit? (Y/N) ");
            log = in.next();
        } while (log.equals("N") || log.equals("n"));

        // Task #3

        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i);
            i++;
        }

        // Task #4

        i= 1;
        do {
            if ((i % 5) == 0) {
                System.out.println("Number " + i + " divided by 5 without remainder.");
            }
            i++;
        } while (i <= 100);

        // Task #5

        String word;
        i = 0;
        String text = "Enter word 'hello', please! ";
        do {
            i++;
            System.out.print(text);
            word = in.next();
            text = "Wrong entry! Try again, please! ";
        } while (!word.equals("hello"));
        String step = (i == 1) ? " step" : " steps";
        System.out.println("Congratulations!!! You word: " + word);
        System.out.println("You used " + i + step);
    }
}
