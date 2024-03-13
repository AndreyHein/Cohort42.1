package lesson25.homeWork;

public class Car extends Vehicle {
    public Car(String n) {
        super(n);
    }

    @Override
    public String startEngine() {
        return "Motor start " + name;
    }
}

