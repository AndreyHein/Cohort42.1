package lesson15;

import java.util.Scanner;

public class Cat {
    Scanner scanner = new Scanner(System.in);
    int food;
    int[] foodArray = {200, 150, 100, 50};
    String name;
    String color;
    int age;
    int volume;
    int realVolume;

    public Cat(String name, String color, int age, int volume) {
        realVolume = volume;
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
    }

    public void eat() {
            System.out.println("1. Meat (200 kcal)");
            System.out.println("2. Fish (150 kcal)");
            System.out.println("3. Milk (100 kcal)");
            System.out.println("4. Vegetables (50 kcal)");
            System.out.print("What to feed a cat? ");
            int i = scanner.nextInt();
        this.food = foodArray[i - 1];
        realVolume += food;
    }

    public double satiated() {
        return  (double) realVolume / volume * 100;
    }

    public void  voice() {
        System.out.println("Meow!");
    }

    public void ran(){
        if (realVolume > 50) {
            realVolume -= 50;
        } else {
            System.out.println("The cat can't run, needs to be fed");
            eat();
        }
    }

    public void walk(){
        if (realVolume > 25) {
            realVolume -= 25;
        } else {
            System.out.println("The cat can't walk, needs to be fed");
            eat();
        }
    }
}
