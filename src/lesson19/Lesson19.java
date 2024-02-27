package lesson19;

import java.util.ArrayList;

/**
 * AIT-TR, Java Basic, Lesson #19
 *
 * @version 26-Feb-2024
 */

public class Lesson19 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(8);
        ra.add(12);
        ra.add(-1);
        ra.add(3);
        ra.add(25);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
        ra.add(-1,2);
        System.out.println(ra);
        ra.add(-10,1);
        System.out.println(ra);
    }
}
