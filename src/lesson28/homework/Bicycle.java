package lesson28.homework;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Let's go!");
    }

    public class HandleBar {
        public void right() {
            System.out.println("Wheel to the right!");
        }
        public void left() {
            System.out.println("Wheel to the left!");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("Raise the seat up!");
        }
        public void down() {
            System.out.println("Place the seat down!");
        }
        public void getSeatParam() {
            System.out.println("Seat parameter: seatpost diameter = " + Bicycle.this.seatPostDiameter);
        }
    }
}
