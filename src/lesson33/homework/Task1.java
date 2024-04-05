package lesson33.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 33 Task#1
 * @author Andrey Hein
 * @version 05-Apr-2024
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrList1 = new ArrayList<>();
        arrList1.add(0); arrList1.add(1);
        arrList1.add(2); arrList1.add(3);
        arrList1.add(4); arrList1.add(5);
        arrList1.add(8); arrList1.add(9);

        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(3); arrList2.add(4);
        arrList2.add(5); arrList2.add(6);
        arrList2.add(7); arrList2.add(8);
        arrList2.add(0); arrList2.add(1);

        System.out.println("Some values: " + findSomeValues(arrList1, arrList2));

    }

    public static <A> List<A> findSomeValues(List<A> arr1, List<A> arr2) {
        List<A> result = new ArrayList<>();
        for (A value : arr1) {
            if (arr2.contains(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
