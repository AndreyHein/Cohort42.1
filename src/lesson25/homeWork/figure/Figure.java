package lesson25.homeWork.figure;

public class Figure {
    protected int width, height;
    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Figure() {
    }

    public double calcArea() {
        return width * height;
    }
}
