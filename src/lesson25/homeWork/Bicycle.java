package lesson25.homeWork;

public class Bicycle extends Vehicle {

    public Bicycle(String n) {
        super(n);
    }

    @Override
    public String startEngine() {
        return "Press the pedals " + name;
    }
}
