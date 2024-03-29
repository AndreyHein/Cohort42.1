package lesson25.homeWork.figure;

public class Circle extends Figure {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle area: " + String.format("%.2f",calcArea()));
    }
}
