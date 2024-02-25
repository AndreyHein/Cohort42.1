package lesson18;

public class Truck {
    private String carBrand;
    private int carry;
    private int numberAxes;
    private static int count;

    public Truck(String carBrand, int carry, int numberAxes) {
        this.carBrand = carBrand;
        this.carry = carry;
        this.numberAxes = numberAxes;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Truck { " +
                "Manufacture= '" + carBrand + '\'' +
                ", Carrying= " + carry +
                ", number of Axes= " + numberAxes +
                " }";
    }
}
