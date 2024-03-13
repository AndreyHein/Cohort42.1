package lesson25.homeWork.figure;

public class RightTriangle extends Figure {
    public RightTriangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double calcArea() {
        return (height * width) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle area: " + String.format("%.2f",calcArea());
    }

}
