package lesson29;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #29
 *
 * @version 20-Mar-24
 * @modify  25-Mar-24
 * @author Andrey Hein
 */
public class Lesson29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        System.out.println(rubberList);
        System.out.println(rubberList.get(0));
        // add to end of list
        rubberList.addEnd(20);
        System.out.println(rubberList.get(0));
        rubberList.addEnd(3);
        rubberList.addEnd(-8);
        rubberList.addEnd(2024);
        rubberList.addEnd(1);
        rubberList.addEnd(-5);
        System.out.println(rubberList);
        // get
        System.out.println(rubberList.get(3));
        System.out.println(rubberList.get(-1));
        System.out.println(rubberList.get(6));
        // remove
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(2);
        System.out.println(rubberList);
        // add of index
        rubberList.addIdx(2024, 3);
        System.out.println(rubberList);
        rubberList.remove(0);
        System.out.println(rubberList);
        // add to begin of list
        rubberList.addBegin(20);
        rubberList.addBegin(-100);
        rubberList.addEnd(100);
        System.out.println((rubberList) + " Size: " + rubberList.size());
        // return index of value
        System.out.println("Index: " + rubberList.indexOf(-8));
        System.out.println("Index: " + rubberList.indexOf(10));
        int search = 2;
        System.out.println(rubberList.contains(search) ? "Index --> " + rubberList.indexOf(search) : "Index not found");
    }
}
