package lesson15;

public class Car {
    String carMake;
    String color;
    int year;
    int volume;
    int realVolume;
    boolean motor;
    double fuel = 0.08;         // Liter at 1 km

    public Car(String carMake, String color, int year, int volume) {
        this.realVolume = 0;
        this.carMake = carMake;
        this.color = color;
        this.year = year;
        this.volume = volume;
    }

    public void refuel() {
        realVolume = volume;
        System.out.println("Tank is full!");
    }

    public void startEngine () {
        if (realVolume > 0) {
            System.out.println("Drrr...drrr...drr...");
            this.motor = true;
        } else {
            System.out.println("Tank is empty, needs to be refuel a car!");
            this.motor = false;
        }
    }

    public void startEngine (int engine){
        System.out.println("Motor stop!");
        this.motor = false;
    }

    public void drive (int distance){
            if ((distance * fuel) <= realVolume){
                System.out.println("Let's go !!!");
                realVolume -= (distance * fuel);
                System.out.println("Remaining fuel in the tank: " + realVolume + " liters");
                if (realVolume <= 10) {
                    System.out.println("Too little fuel, needs to be refuel a car!");
                }
            } else if ((distance * fuel) > realVolume && (distance * fuel) <= volume) {
                System.out.println("Not enough fuel, needs to be refuel a car!");
            } else {
                System.out.println("The distance is too long, there is not enough fuel!");
            }
    }
}
