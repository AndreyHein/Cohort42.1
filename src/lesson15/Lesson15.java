package lesson15;

/**
 * AIT-TR, Java Basic, Lesson #15
 *
 * @version 16-Feb-24
 */

public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat();
                cat.voice();
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age);

        Cat cat1 = new Cat("Barsik","black",5, 10);
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
        cat1.eat(5);
        System.out.println(cat1.satiated());
    }
}
