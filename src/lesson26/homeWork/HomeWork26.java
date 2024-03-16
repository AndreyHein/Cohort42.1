package lesson26.homeWork;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 26
 * @author Andrey Hein
 * @version 15-Mar-2024
 */

public class HomeWork26 {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumPerimeter = 0;

        Figure[] figure = {
                new Circle(15),
                new Triangle(1,2,3),
                new Rectangle(2,4)
        };

        for (Figure f : figure) {
            sumArea += f.calcArea();
            sumPerimeter += f.calcPerimeter();
        }
        System.out.println(sumArea);
        System.out.println(sumPerimeter);
    }
}
