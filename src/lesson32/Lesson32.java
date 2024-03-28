package lesson32;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #29
 *
 * @version 20-Mar-24
 */
public class Lesson32 {
    public static void main(String[] args) {
        // enums
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY:
                break;
            case FRIDAY:
                System.out.println("It's Friday.");
                break;
        }
        // generics before Java 5.0
        ObjectBox ob1 = new ObjectBox(2);
        ObjectBox ob2 = new ObjectBox(5);
        if (ob1.getObj() instanceof  Integer && ob2.getObj() instanceof Integer) {
            int s = (int) ob1.getObj() + (int) ob2.getObj();
            System.out.println("S = " + s);
        }

        // after Java 5.0 generics
        GenericBox<Integer> gb1 = new GenericBox<>(7);
        GenericBox<Integer> gb2 = new GenericBox<>(4);
        int s = gb1.getObj() + gb2.getObj();
        System.out.println("S = " + s);

        GenericBox<String> gb3 = new GenericBox<>("Hello");
        GenericBox<String> gb4 = new GenericBox<>("Java");
        String str = gb3.getObj() + ", " + gb4.getObj() + "!";
        System.out.println(str);

        //GenericBox<int> gb5;  //type argument cannot be primitive type

        // RubberArray with generics
        RubberArray<String> rbString = new RubberArray<>();
        rbString.add("Hello ");
        rbString.add("Java");
        rbString.add("!!!");
        System.out.println(rbString);

        RubberArray<Float> rbFloat = new RubberArray<>();
        rbFloat.add(4.2f);
        rbFloat.add(5f);
        rbFloat.add(-3f);
        System.out.println(rbFloat);
    }

}
