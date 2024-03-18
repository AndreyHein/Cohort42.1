package lesson27.homework;

public class Triathlete implements Swimmer, Runner {
    @Override
    public void run() {
        System.out.println("Athlete run");
    }

    @Override
    public void swim() {
        System.out.println("Athlete swim");
    }
}
