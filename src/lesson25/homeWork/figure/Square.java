package lesson25.homeWork.figure;

public class Square extends Figure {
    public Square(int height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return height * height;
    }

    @Override
    public String toString() {
        return "Square area: " + String.format("%.2f",calcArea());
    }
}
