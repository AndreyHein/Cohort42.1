package lesson8;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 8
 * @author Andrey Hein
 * @version 01-Feb-2024
 */

public class HomeWork8 {
    public static void main(String[] args) {

        // Task #1

        for (int i = 1; i <= 10; i++) {
            System.out.println("Task" + i);
        }

        // Task #2

        int[] arr = new int[20];
        Random rn = new Random();
        System.out.println("Numbers divided by 5 without remainder:");
        for ( int i =0; i < 20; i++) {
            arr[i] = rn.nextInt(100);
            if ((arr[i] % 5) == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nArray values: " + Arrays.toString(arr));

        // Task #3

        String[] array = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int i_max = 0;
        int max = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                i_max = i;
            }
        }
        for (int j = 0; j < max; j++) {
            System.out.println(array[i_max].charAt(j));
        }

        // Task #4

        int[] arrayInt = new int[20];
        Random random = new Random();

        for ( int i =0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
        }
        System.out.println("\nArray values: " + Arrays.toString(arrayInt));

        int maxNumber = arrayInt[0];
        int minNumber = arrayInt[0];
        double average = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxNumber) {
                maxNumber = arrayInt[i];                // Maximum of array
            }
            if (arrayInt[i] < minNumber) {
                minNumber = arrayInt[i];                // Minimum of array
            }
            average += arrayInt[i];
        }
        average /= arrayInt.length;                     // Average of array
        System.out.println("Minimum of array: " + minNumber);
        System.out.println("Maximum of array: " + maxNumber);
        System.out.println("Average of array: " + average);
    }
}
