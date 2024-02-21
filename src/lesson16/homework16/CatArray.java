package lesson16.homework16;

import lesson16.Plate;

public class CatArray {
    CatHome[] a = new CatHome[10];
    int idx = 0;
    int realVolume = 0;
    int maxVolume;
    int food;

    public void insert(String name, String color, int age) {
        a[idx] = new CatHome(name, color, age, age * 10);
        idx++;
    }

    public void printA(int i) {
            a[i].printCat();
    }

    public void eatCat(Plate plate, int i) {
            food = plate.amountFood();
            realVolume = 0;
            maxVolume = a[i].getVolume();
            if (food >= maxVolume - realVolume) {
                food = maxVolume - realVolume;
            }
            realVolume += food;
            plate.decreaseFood(food);
    }
}
