package Shape;

public class Triangle implements Shape {

    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle() {
        this(4, 4);
    }

    public double square() {
        return 0.5 * length * height;
    }
}
