package lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 9
 * @author Andrey Hein
 * @version 05-Feb-2024
 */

public class HomeWork9 {
    public static void main(String[] args) {

        // Task #1

        for (int i = 1; i <= 10; i++) {
            printTask (i);
        }

        // Task #2

        int[] arr = {1, 4, 3, 6, 7};
        printArr1(arr);                             // 1 variant
        printArr2(arr);                             // 2 variant

        // Task #3

        boolean order = true;
        System.out.print("Reverse array: ");
        printArr2(arr, order);
        order = false;
        System.out.print("Normal array: ");
        printArr2(arr, order);

        // Task #4

        double[] result = maxmin(arr);
        System.out.println("Maximum of array: " + (int)result[0]);
        System.out.println("Minimum of array: " + (int)result[1]);
        System.out.println("Average of array: " + result[2]);

    }
        // 1 variant of Task2
    static void printArr1 (int[] a) {
        System.out.print("[ ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
    }
        // 2 variant (in Google found) of Task2
    static void printArr2 (int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    // Method of Task3
    static void printArr2 (int[] a, boolean b) {
        if (b) {
            printArr1(a);
        } else System.out.println(Arrays.toString(a));
    }

    // Method of Task4
    static double[] maxmin(int[] a) {
        double s[] = {a[0], a[0], 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > s[0]) { s[0] = a[i]; }
            if (a[i] < s[1]) { s[1] = a[i]; }
            s[2] += a[i];
        }
        s[2] = s[2] / a.length;
        return s;
    }
    // Method of Task1
    static void printTask (int a) {
        System.out.println("Task" + a);
    }

    // Calculator

    static int calc (String[] str){
        int res = Integer.valueOf(str[0]);
        for (int i = 1; i < str.length && str[i] != null; i += 2) {

            switch (str[i]) {
                case "+":
                    res += Integer.valueOf(str[i+1]);
                    break;
                case "-":
                    res -= Integer.valueOf(str[i+1]);
                    break;
                case "*":
                    res *= Integer.valueOf(str[i+1]);
                    break;
                case "/":
                    res /= Integer.valueOf(str[i+1]);
                    break;
            }
        }
        return res;
    }
}
