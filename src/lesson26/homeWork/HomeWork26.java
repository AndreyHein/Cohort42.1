package lesson26.homeWork;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 26
 * @author Andrey Hein
 * @version 15-Mar-2024
 */

public class HomeWork26 {
    static double sumArea = 0;
    static double sumPerimeter = 0;
    public static void main(String[] args) {
        Figure[] figure = {
                new Circle(15),
                new Triangle(1,2,3),
                new Rectangle(2,4)
        };

        for (Figure f : figure) {
            sumArea = sumArea + f.calcArea();
            sumPerimeter = sumPerimeter + f.calcPerimeter();
        }
        System.out.println(sumArea);
        System.out.println(sumPerimeter);
    }
}
