package lesson22.homework;

public class Truck extends Transport {
    private final int Q = 18;   // Coefficient
    private int carrying;       // Lifting capacity (kg)

    public Truck(String name, int motor, int speed, int tank, int carrying) {
        super(name, motor, speed, tank);
        this.carrying = carrying;
    }

    @Override
    public int maxDistance() {
        int fuelConsumption = Math.round (motor / Q);
        return (tank / fuelConsumption / 100);
    }

    @Override
    public String toString() {
        return "Truck{ " +
                ", Manufacture= " + getName() +
                ", motor= " + motor +
                ", speed= " + speed +
                ", tank= " + tank +
                ", carrying= " + carrying +
                " }" + "\n" +
                "Max distance= " + maxDistance() + " km";
    }
}
