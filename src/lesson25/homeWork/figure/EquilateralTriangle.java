package lesson25.homeWork.figure;

public class EquilateralTriangle extends Figure {
    public EquilateralTriangle(int wight) {
        this.width = wight;
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 4) * width * width;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle area: " + String.format("%.2f",calcArea());
    }

}
