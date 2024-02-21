package lesson16.homework16;

import lesson16.Plate;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 16
 * @author Andrey Hein
 * @version 21-Feb-2024
 */

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        CatArray arr = new CatArray();
        Plate plate = new Plate(500);
        int amountFood;

        arr.insert("Barsik", "white", random.nextInt(10) + 1);
        arr.insert("Murzik", "black", random.nextInt(10) + 1);
        arr.insert("Felix", "ginger", random.nextInt(10) + 1);
        arr.insert("Belka", "white", random.nextInt(10) + 1);
        arr.insert("Tishka", "black", random.nextInt(10) + 1);
        arr.insert("Lotos", "white-black", random.nextInt(10) + 1);
        arr.insert("Murka", "smoky", random.nextInt(10) + 1);
        arr.insert("Persik", "orange", random.nextInt(10) + 1);
        arr.insert("Kesha", "striped", random.nextInt(10) + 1);
        arr.insert("Sima", "brown", random.nextInt(10) + 1);

        for (int i = 0; i < 10 ; i++) {
            arr.printA(i);
        }
        plate.add(500);

        for (int i = 0; i < 10; i++) {
            arr.eatCat(plate, i);
            if (plate.amountFood() != 0) {
                System.out.println("Plate: " + plate.amountFood() + " Well-fed cat:" + arr.realVolume);
                arr.printA(i);
            } else {
                System.out.println("This cat is hungry:" + plate.amountFood());
                arr.printA(i);
            }
        }
        System.out.println("Plate is empty, needs to be filled");
    }
}
