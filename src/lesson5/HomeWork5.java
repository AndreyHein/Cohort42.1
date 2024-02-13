package lesson5;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 5
 * @author Andrey Hein
 * @version 25-Jan-2024
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {

        // Task #1

        boolean log1, log2, log3;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        num = in.nextInt();
        log1 = num % 2 == 0;
        log2 = num % 3 == 0;
        log3 = log1 && log2;
        System.out.printf("Number: %d are even: %b ; multiple of 3: %b ; even and multiple of 3: %b" , num , log1 , log2 , log3);

        // Task #2

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 or 2 or 3: ");
        number = input.nextInt();

        if (number == 1) {
            System.out.println("You entered number ONE.");
        } else if (number == 2) {
            System.out.println("You entered number TWO.");
        } else if (number == 3) {
            System.out.println("You entered number THREE.");
        } else {
            System.out.println("Incorrectly entered number!");
        }

        // Task #3

        Random rn = new Random();

        int a = rn.nextInt(101);
        int b = rn.nextInt(101);
        int c = rn.nextInt(101);
        int d = rn.nextInt(101);

        System.out.println("Four numbers generated: " + a + ", " + b + ", " + c + ", " + d);

        if (a >= b && a>= c && a >= d) {
            System.out.println("Max number is: " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("Max number is: " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("Max number is: " + c);
        } else System.out.println("Max number is: " + d);

        // Task #4

        String luckyNum;
        Scanner str = new Scanner(System.in);
        System.out.print("Enter four digit number: ");
        luckyNum = str.next();
        char pos0 = luckyNum.charAt(0); int num0 = pos0 - '0';          //
        char pos1 = luckyNum.charAt(1); int num1 = pos1 - '0';          //  Conversion: Symbol (Char) -> Number (Int)
        char pos2 = luckyNum.charAt(2); int num2 = pos2 - '0';          //
        char pos3 = luckyNum.charAt(3); int num3 = pos3 - '0';          //

        if (luckyNum.length() != 4) {                                   //
            System.out.println("Incorrectly entered number!");          //  Is it right, entered length.
        } else if (num0 > 9 || num1 > 9 || num2 > 9 || num3 > 9) {      //
            System.out.println("Incorrectly entered number!");          //  Is it right, number or symbol entered.
        } else {
            if ((num0 + num1) == (num2 + num3)) {
                System.out.println("Congratulations!!! The number is LUCKY !!!");
            } else {
                System.out.println("Sorry, the number is NOT LUCKY !!!");
            }
        }
    }
}