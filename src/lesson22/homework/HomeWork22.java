package lesson22.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 22
 * @author Andrey Hein
 * @version 06-Mar-2024
 */

public class HomeWork22 {
    public static void main(String[] args) {

        Transport transport[] = new Transport[3];
        transport[0] = new Truck("Scania", 421, 85, 1000, 40000);
        transport[1] = new Ship("Oasis of the Seas", 97020, 44, 210000000, 6880, 220000);
        transport[2] = new Plane("Boeing 737-800", 128700, 842, 40530, 186, 2);

        for (int i = 0; i < transport.length; i++) {
            System.out.println(transport[i]);
        }
    }
}
