package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 6, Task #6
 * @author Andrey Hein
 * @version 28-Jan-2024
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String str = in.nextLine();                             // very important to use .nextLine()
        String pos1 = new String(), pos2 = new String();
        boolean log = false;
        char sign = ' ';
        int i = 0;
        int length = str.length();
        int num = str.charAt(i) - '0';
        if (num <= 9 && num >= 0 && length >= 2) {
            while (i < length) {
                switch (str.charAt(i)) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        if (sign == ' ') {
                            pos1 = pos1 + str.charAt(i);
                            break;
                        } else {
                            pos2 = pos2 + str.charAt(i);
                            break;
                        }
                    case '+':
                        sign = str.charAt(i);
                        log = true;
                        break;
                    case '-':
                        sign = str.charAt(i);
                        log = true;
                        break;
                    case '*':
                        sign = str.charAt(i);
                        log = true;
                        break;
                    case ':':
                    case '/':
                        sign = str.charAt(i);
                        log = true;
                        break;
                    case ' ':
                        break;
                    default:
                         log = false;
                        break;
                }
                i++;
            }
            if (log) {
                int int1 = Integer.valueOf(pos1);
                int int2 = Integer.valueOf(pos2);
                int result;
                switch (sign) {
                    case '+':
                        result = int1 + int2;
                        System.out.print(pos1 + " " + sign + " " + pos2 + " = " + result);
                        break;
                    case '-':
                        result = int1 - int2;
                        System.out.print(pos1 + " " + sign + " " + pos2 + " = " + result);
                        break;
                    case '*':
                        result = int1 * int2;
                        System.out.print(pos1 + " " + sign + " " + pos2 + " = " + result);
                        break;
                    case '/':
                    case ':':
                        if (int1 % int2 == 0) {
                            result = int1 / int2;
                            System.out.print(pos1 + " " + sign + " " + pos2 + " = " + result);
                        } else {
                            float res = (float) int1 / (float) int2;
                            System.out.print(pos1 + " " + sign + " " + pos2 + " = " + res);
                        }

                }
            } else {System.out.println("Error: unknown operation: ");}
        } else {
            System.out.println("Wrong entry!");
        }
    }
}
