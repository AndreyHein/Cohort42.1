package lesson33.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 33 Task#2
 * @author Andrey Hein
 * @version 05-Apr-2024
 */
public class Task2 {
    private static int SIZE_ARRAY = 5000;
    private static int BOUND = 1000;

    public static void main(String[] args) {
        List<Integer> listArr = new ArrayList<>();
        List<Integer> listLnArr = new LinkedList<>();
        UseListMethods methods = new UseListMethods();

        for (int i = 0; i < SIZE_ARRAY - 1; i++) {
            methods.addAll(listArr);
            methods.addAll(listLnArr);
        }

        System.out.println("ArrayList");
        System.out.println("Time of used method 'getValueOfIdx' -> " + methods.getValueOfIdx(listArr));
        System.out.println("Time of used method 'addNewValue' -> " + methods.addNewValue(listArr));
        System.out.println("Time of used method 'delUnitOfIdx' -> " + methods.delUnitOfIdx(listArr));
        System.out.println("Time of used method 'delUnitOfValue' -> " + methods.delUnitOfValue(listArr));
        System.out.println("");
        System.out.println("LinkedList");
        System.out.println("Time of used method 'getValueOfIdx' -> " + methods.getValueOfIdx(listLnArr));
        System.out.println("Time of used method 'addNewValue' -> " + methods.addNewValue(listLnArr));
        System.out.println("Time of used method 'delUnitOfIdx' -> " + methods.delUnitOfIdx(listLnArr));
        System.out.println("Time of used method 'delUnitOfValue' -> " + methods.delUnitOfValue(listLnArr));
    }
}
