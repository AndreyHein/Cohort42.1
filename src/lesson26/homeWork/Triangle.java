package lesson26.homeWork;

public class Triangle extends Figure {
    private int length, width, height;
//    public Triangle(int length) {
//        this.length = length;                   // equilateral triangle
//    }

    public Triangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;                   // Heron's formula
    }

//    public Triangle(int length, int width) {
//        this.length = length;
//        this.width = width;                     // right triangle
//    }

//    @Override
//    public double calcArea() {
//        return 0;
//    }
//
//    @Override
//    public double calcArea(int length) {
//        return length * length * Math.sqrt(3) / 4;  // equilateral triangle
//    }
//
//    @Override
//    public double calcArea(int length,int width) {
//        return length * width / 2;                  // right triangle
//
//    }

    @Override
    public double calcArea() {
        double p = (length + width + height) / 2;
        return Math.sqrt(p * (p - length) * (p - width) * (p - height));// Heron's formula
    }

    @Override
    public double calcPerimeter() {
        return length + width + height;
    }

//    @Override
//    public double calcPerimeter() {
//        return length + width + height;
//    }
}
