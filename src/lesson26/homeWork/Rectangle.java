package lesson26.homeWork;

public class Rectangle extends Figure {
    private int length, width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return (length + width) * 2;
    }
}
