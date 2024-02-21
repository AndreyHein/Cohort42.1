package lesson16;

public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat(30);
        Plate plate = new Plate(50);
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);

        plate.add(20);
        cat.eat(plate);
        //plate.feeding(plate.amountFood());

        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);
    }
}
