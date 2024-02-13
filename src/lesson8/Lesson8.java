package lesson8;

import java.util.Arrays;

/**
 * AIT-TR, Java Basic, Lesson #8
 *
 * @version 31-Jan-24
 */

public class Lesson8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arr = {7, 2, -5, 11, 1};
        System.out.println(arr[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
