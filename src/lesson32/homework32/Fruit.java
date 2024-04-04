package lesson32.homework32;

import java.util.Random;

abstract public class Fruit {
    protected float weight;

    public Fruit(float fromWeight, float ToWeight) {
        Random random = new Random();
        weight = fromWeight + random.nextFloat(ToWeight - fromWeight);
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{weight=" + weight + '}';
    }
}
