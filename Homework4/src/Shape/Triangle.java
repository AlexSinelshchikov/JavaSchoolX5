package Shape;

public class Triangle implements Shape {

    public double length;
    public double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public Triangle() {
        this(4, 4);
    }

    public double square() {
        return 0.5 * length * height;
    }
}
