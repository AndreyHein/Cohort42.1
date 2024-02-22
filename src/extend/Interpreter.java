package extend;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, hw #10 ext
 *
 * @author Sergey Iryupin
 * @version 08-Feb-24
 */

public class Interpreter {

    static int[] values = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreted");
                    break;
                default:
                    assignValue(line);
            }
        } while (!line.equals("exit"));
    }

    static void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();
        // transform 'a' --> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" --> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String nameVariable) {
        int idx = nameVariable.charAt(0) - 'a';
        System.out.println(values[idx]);
    }
}
