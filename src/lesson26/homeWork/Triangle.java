package lesson26.homeWork;

public class Triangle extends Figure {
    private int length, width, height;
    public Triangle(int length) {
        this.length = length;                   // equilateral triangle
        this.width = -1;
        this.height = -1;
    }

    public Triangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;                   // Heron's formula
    }

    public Triangle(int length, int width) {
        this.length = length;
        this.width = width;                     // right triangle
        this.height = -1;
    }

    @Override
    public double calcArea() {
        if (length > 0 && width > 0 && height > 0) {
            double p = (length + width + height) / 2;
            return Math.sqrt(p * (p - length) * (p - width) * (p - height));// Heron's formula
        } else {
            if (length > 0 && width < 0 && height < 0) {
                return length * length * Math.sqrt(3) / 4;                  // equilateral triangle
            }
        }
        return length * width / 2;                                          // right triangle
    }

    @Override
    public double calcPerimeter() {
        return length + width + height;
    }
}
