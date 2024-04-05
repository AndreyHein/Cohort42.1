package lesson33.homework;

import java.util.List;
import java.util.Random;

public class  UseListMethods {
    private long startTime;
    private long endTime;
    private final int BOUND = 1000;
    private final int NEW_AMOUNT = 2000;
    private final int DEL_AMOUNT = 1000;
    Random random = new Random();

    public void addAll(List<Integer> list) {
        list.add(random.nextInt(BOUND));
    }

    public long getValueOfIdx(List<Integer> list) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long addNewValue (List<Integer> list) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NEW_AMOUNT; i++) {
            list.add(random.nextInt(list.size()), random.nextInt(BOUND));
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long delUnitOfIdx(List<Integer> list) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < DEL_AMOUNT; i++) {
            list.remove(random.nextInt(list.size()));
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long delUnitOfValue(List<Integer> list) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < DEL_AMOUNT; i++) {
            list.remove(random.nextInt(BOUND));
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
