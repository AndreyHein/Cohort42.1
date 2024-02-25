package lesson18;

public class HomeWork18 {
    public static void main(String[] args) {
        Truck lkw1 = new Truck("SCANIA", 40, 5);
        System.out.println("Number of created objects: " + Truck.getCount());
        System.out.println(lkw1);

        Truck lkw2 = new Truck("MAN", 18, 3);
        System.out.println("Number of created objects: " + Truck.getCount());
        System.out.println(lkw2);

        Truck lkw3 = new Truck("DAF", 12, 2);
        System.out.println("Number of created objects: " + Truck.getCount());
        System.out.println(lkw3);
    }
}
