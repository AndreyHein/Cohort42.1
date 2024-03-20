package lesson28.homework;

public class Main {
    public static void main(String[] args) {
        Bicycle peugeot = new Bicycle("Peugeot",120,40);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat= peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        seat.down();

        seat.getSeatParam();
    }
}
