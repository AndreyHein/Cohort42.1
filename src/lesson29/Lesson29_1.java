package lesson29;

public class Lesson29_1 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        rubberList.addEnd(7);
        rubberList.addEnd(4);
        rubberList.addEnd(12);
        rubberList.addEnd(1);
        rubberList.addEnd(-5);
        System.out.println(rubberList);
        System.out.println(rubberList.get(2));
        rubberList.remove(2);
        System.out.println(rubberList);
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(rubberList.size() - 1);
        System.out.println(rubberList);
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.addIdx(10,0);
        rubberList.addIdx(15, 1);
        System.out.println(rubberList);
        System.out.println("Index: " + rubberList.indexOf(15));
        System.out.println("Index: " + rubberList.indexOf(10));
        System.out.println(rubberList.contains(1));
        System.out.println(rubberList.contains(20));
        System.out.println(rubberList.contains(15));
        System.out.println(rubberList.contains(-5));
        System.out.println(rubberList.contains(10));
    }
}
