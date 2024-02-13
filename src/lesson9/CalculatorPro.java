package lesson9;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 9, Task #5
 * @author Andrey Hein
 * @version 05-Feb-2024
 */

public class CalculatorPro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String exp = in.nextLine();
        String[] tokens = new String[30];
        int idx = 0;
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = "";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
                case  ' ':
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }

        // Output of result

        System.out.print("[ ");
        for (int i =0; i < tokens.length && tokens[i] != null; i++) {
                System.out.print(tokens[i] + " ");
        }
        System.out.println("] --> " + calcPro(tokens));
    }
    // methode of Task #5
    static int calcPro (String[] str) {
        int temp = 0; int res = 0;

        for (int i =0; i < str.length && str[i] != null; i++) {
            switch (str[i]) {
                case "*":
                    temp = Integer.valueOf(str[i-1]) * Integer.valueOf(str[i+1]);
                    str[i] = Integer.toString(temp);
                    str[i-1] = null; str[i+1] = null;
                    break;
                case "/":
                    temp = Integer.valueOf(str[i-1]) / Integer.valueOf(str[i+1]);
                    str[i] = Integer.toString(temp);
                    str[i-1] = null; str[i+1] = null;
                    break;
            }
        }

        int j = 0;
        String[] newStr = new String[20];

        for (int i = 0; i < str.length; i++) {
            if (str[i] != null){
                newStr[j] = str[i];
                j++;
            }
        }
        res = Integer.valueOf(newStr[0]);
        for (int i = 1; i < newStr.length && newStr[i] != null; i += 2) {
            switch (newStr[i]) {
                case "+":
                    res += Integer.valueOf(newStr[i+1]);
                    break;
                case "-":
                    res -= Integer.valueOf(newStr[i+1]);
                    break;
            }
        }
        return res;
    }
}
