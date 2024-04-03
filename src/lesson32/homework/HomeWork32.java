package lesson32.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 32
 * @author Andrey Hein
 * @version 03-Apr-2024
 */
public class HomeWork32 {
    public static void main(String[] args) {

        // Task #1
        String[] strArray = {"Hello", "Java", "I", "love", "you", "!"};
        ArrayToArrayList array = new ArrayToArrayList<> (strArray);
        if (array.changeElements("Hello", "Java")) {
            System.out.println(array);
        } else {
            System.out.println("One of the items was not found");
        }

        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        array = new ArrayToArrayList<> (intArray);
        if (array.changeElements(2, 3)) {
            System.out.println(array);
        } else {
            System.out.println("One of the items was not found");
        }

        Double[] doubleArray = {5.6, 9.78, 45.999, 1.001, 0.0008, 100., 50., -7.50, - 10.999};
        array = new ArrayToArrayList<>(doubleArray);
        if (array.changeElements(100., -7.50)) {
            System.out.println(array);
        } else {
            System.out.println("One of the items was not found");
        }

        Character[] chArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        array = new ArrayToArrayList<>(chArray);
        if (array.changeElements('g', 'b')) {
            System.out.println(array);
        } else {
            System.out.println("One of the items was not found");
        }

        // Task #2
        System.out.println(array.toArrayList(strArray));
        System.out.println(array.toArrayList(intArray));
        System.out.println(array.toArrayList(chArray));
    }
}
