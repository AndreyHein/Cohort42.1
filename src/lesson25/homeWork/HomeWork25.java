package lesson25.homeWork;
import lesson25.homeWork.figure.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 22
 * @author Andrey Hein
 * @version 06-Mar-2024
 */

public class HomeWork25 {
    public static void main(String[] args) {

        //Task #1
        Human human = new Human();
        System.out.println(human.run());
        Human sportMan = new SportMan();
        System.out.println(sportMan.run());
        Human superMan = new SuperMan();
        System.out.println(superMan.run());

        // Task #2
        Vehicle[] vehicle = new Vehicle[3];
        vehicle[0] = new Car("BMW");
        System.out.println(vehicle[0].startEngine());
        vehicle[1] = new Bicycle("Rocky Mountain");
        System.out.println(vehicle[1].startEngine());
        vehicle[2] = new Motorcycle("YAMAHA");
        System.out.println(vehicle[2].startEngine());

        // Task #3
        Figure[] figure = {
            new Circle(15),
            new EquilateralTriangle(10),
            new RightTriangle(5,8),
            new Square(6),
            new Trapezoid(6,8,4)
        };
        for (Figure f : figure) {
            System.out.println(f);
        }
    }
}
