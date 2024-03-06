package lesson22.homework;

public abstract class Transport {

    private String name;      // Manufacture name
    protected int motor;      // Engine power (kW)
    protected int speed;      // Speed (km/h)
    protected int tank;       // Volume tank (l)
    protected final double DIESEL = 0.85;

    public Transport(String name, int motor, int speed, int tank) {
        this.name = name;
        this.motor = motor;
        this.speed = speed;
        this.tank = tank;
    }

    public String getName() {
        return name;
    }

    abstract int maxDistance();

}
