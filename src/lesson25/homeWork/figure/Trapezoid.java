package lesson25.homeWork.figure;

public class Trapezoid extends Figure {
    private int width1;
    public Trapezoid(int width, int width1, int height) {
        super(width, height);
        this.width1 = width1;
    }

    @Override
    public double calcArea() {
        return (width1 * width) / 2 * height;
    }

    @Override
    public String toString() {
        return "Trapezoid area: " + String.format("%.2f",calcArea());
    }
}
