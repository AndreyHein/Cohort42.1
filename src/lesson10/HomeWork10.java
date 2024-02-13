package lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 10
 * @author Andrey Hein
 * @version 07-Feb-2024
 */

public class HomeWork10 {
    static String[][] variable = new String[2][27];
    static int idx = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        do {
            String[] tokens = new String[10];
            System.out.print("Enter the teams ['print' or 'exit' or variable (char) = :");
            String exp = in.nextLine();
            int idx = 0;
            String symbol = "";
            char [] charExp = exp.toCharArray();
            for (char ch : charExp) {
                switch (ch) {
                    case ' ':
                        tokens[idx] = symbol;
                        if (!symbol.isEmpty()) {
                            idx++;
                            symbol = "";
                        }
                        break;
                    case '=':
                        if (!symbol.isEmpty()) {
                            tokens[idx] = symbol;
                            idx++;
                        }
                        tokens[idx] = String.valueOf(ch);
                        idx++;
                        symbol = "";
                        break;
                    default:
                        symbol += ch;
                        break;
                }
            }
            if (!symbol.isEmpty()) {
                tokens[idx] = symbol;
                idx++;
            }
            // logics
            if (isTokensValid(tokens)) {
                if (tokens[0].length() > 1) {
                    if (tokens[0].equals("print")) {
                        for (int i = 0; i < variable.length; i++) {
                            if (variable[0][i].equals(tokens[1])) {
                                System.out.println(variable[1][i]);
                            } else {
                                System.out.println("Variable not defined");
                            }
                        }
                    } else if (tokens[0].equals("exit")) {
                        exit = false;
                    }

                } else if(isVariable(tokens[0])){
                    varEnter(tokens);                   // присвоение variable значения
                }
            }
        } while (exit);
    }

    static boolean isTokensValid (String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == "="){
                if (str[i-1].length() > 1) {
                    System.out.println("Error: variable name is too long");
                    return false;
                }
            }
        }
        return true;
    }
    // если такая переменная уже определена
    static boolean isVariable (String str) {
        for (int i = 0; i < variable.length && variable[0][i] != null; i++) {
            if (variable[0][i].equals(str)) {
                System.out.println("This variable already defined");
                return false;
            }
            System.out.println(Arrays.toString(variable));
        }
        return true;
    }

    // метод присвоения переменной и ее значения
    static void varEnter (String[] str) {
        variable[0][idx] = str[0];
        variable[1][idx] = str[2];
        idx++;
    }
}
