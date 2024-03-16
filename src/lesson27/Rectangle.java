package lesson27;

public class Rectangle implements Figure {
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
