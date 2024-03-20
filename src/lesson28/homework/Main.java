package lesson28.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 27
 * @author Andrey Hein
 * @version 18-Mar-2024
 */
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
