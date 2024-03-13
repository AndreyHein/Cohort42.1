package lesson25.homeWork;

public class Motorcycle extends Vehicle{

    public Motorcycle(String n) {
        super(n);
    }

    @Override
    public String startEngine() {
        return "Energy cell active " + name;
    }
}
