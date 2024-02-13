package lesson13;

import lesson12.HomeWork12;
import java.util.Random;

/**
 * AIT-TR, Java Basic, Lesson #13
 *
 * @version 12-Feb-24
 */

public class Lesson13 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = createRandomArray(100000, 10000);
        System.out.println(("Create random array " + (System.currentTimeMillis() - startTime)) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearch(array, 45));
        System.out.println("linear search " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        HomeWork12.selectionSort(array);
        System.out.println("selection sort " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearch(array, 2));
        System.out.println("binary search " + (System.currentTimeMillis() - startTime) + " ms");
    }
    public  static int[] createRandomArray(int len, int bound) {
        int[] a = new int[len];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(bound);
        }
        return a;
    }
}
