package lesson22.homework;

public class Ship extends Transport{
    private final int Q = 9;   // Coefficient
    private int passenger;      // Number of passengers
    private int displacement;   // in tons
    public Ship(String name, int motor, int speed, int tank, int passenger, int displacement) {
        super(name, motor, speed, tank);
        this.passenger = passenger;
        this.displacement = displacement;
    }

    @Override
    public int maxDistance() {
        int fuelConsumption = Math.round (motor / Q);
        return (tank / fuelConsumption / 100);
    }

    @Override
    public String toString() {
        return "Ship{ " + getName() +
                ", passenger=" + passenger +
                ", displacement=" + displacement +
                ", motor=" + motor +
                ", speed=" + speed +
                ", tank=" + tank +
                " }" + "\n" +
                "Max distance= " + maxDistance() + " mile";
    }
}
