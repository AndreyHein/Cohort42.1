package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Lesson #15
 *
 * @version 16-Feb-24
 */

public class Lesson15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat("Barsik", "black", 5, 200);
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age + " years");
        int action;
        do {
            System.out.println("1. Feed the cat");
            System.out.println("2. The cat is ran");
            System.out.println("3. The cat is walk");
            System.out.println("4. The cat is sleep");
            System.out.print("Select action: ");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    cat.eat();
                    System.out.println("The cat is " + cat.satiated() + " % full");
                    cat.voice();
                    break;
                case 2:
                    cat.ran();
                    System.out.println("The cat lost 50 kcal!");
                    System.out.println("The cat is " + cat.satiated() + " % full");
                    cat.voice();
                    break;
                case 3:
                    cat.walk();
                    System.out.println("The cat lost 25 kcal!");
                    System.out.println("The cat is " + cat.satiated() + " % full");
                    cat.voice();
                    break;
                case 4:
                    System.out.println("The cat went to bed!");
                    cat.voice();
                    break;
                default:
                    System.out.println("Enter is wrong!");
            }
        } while (action != 4);
    }
}
