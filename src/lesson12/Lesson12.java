package lesson12;

import java.util.Arrays;

/**
 * AIT-TR, Java Basic, Lesson #12
 *
 * @version 09-Feb-24
 */

public class Lesson12 {
    public static void main(String[] args) {
        int array[] = {1, 8, 12, -4, 6, 3, 7, -3};
        System.out.println(Arrays.toString(array));
        int toSearch = -8;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toSearch) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        System.out.println(Arrays.toString(array));

        // sorting array
        excangeSort(array);
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        int a = 5;
        addOne(a);
        System.out.println("N = " + a);
    }

    static void addOne(int n){
        n++;
        System.out.println("N = " + n);
    }

    static void excangeSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i + 1];
            int minIdx = i + 1;
            for (int j = i +1; j < a.length; j++) {
                if (a[i] < min) {
                    min = a[j];
                    minIdx = j;
                }
            }
            if (a[i] > min) {
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }
}
