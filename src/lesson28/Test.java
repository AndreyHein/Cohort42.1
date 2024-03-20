package lesson28;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };

        animal1.eat();

        ABleToEat ableToEat =new Animal();
        ableToEat.eat();

        ABleToEat ableToEat1 = new ABleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat1.eat();
    }
}
