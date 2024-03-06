package lesson22.homework;

public class Plane extends Transport{
    private int passenger;      // Number of passengers
    private int numMotor;       // Number of engines

    public Plane(String name, int motor, int speed, int tank, int passenger, int numMotor) {
        super(name, motor, speed, tank);
        this.passenger = passenger;
        this.numMotor = numMotor;
    }

    @Override
    int maxDistance() {
        return 4200;
    }

    @Override
    public String toString() {
        return "Plane{ " + getName() +
                ", motor= " + motor +
                ", speed= " + speed +
                ", tank= " + tank +
                ", passenger= " + passenger +
                ", numMotor= " + numMotor +
                " }" + "\n" +
                "Max distance= " + maxDistance() + " km";
    }
}
