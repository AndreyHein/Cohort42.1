package lesson32.homework32;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork32 {
    public static void main(String[] args) {
        // Task 1
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strArray = {"one", "two", "three", "four", "five", "six", "seven"};
        swapElements(1, 5, intArray);
        System.out.println(Arrays.toString(intArray));
        swapElements(1, 5, strArray);
        System.out.println(Arrays.toString(strArray));

        // Task 2
        System.out.println(arrayToList(intArray));
        System.out.println(arrayToList(strArray));
    }

    static <T> void swapElements(int idxOne, int idxTwo, T[] array) {
        T tmp = array[idxOne];
        array[idxOne] = array[idxTwo];
        array[idxTwo]  = tmp;
    }

    static <T> List<T> arrayToList(T[] array) {
        List<T> result = new ArrayList<>();
        for (T item : array) {
            result.add(item);
        }
        return result;
    }
}
