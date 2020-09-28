package Shape;

public class Circle implements Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
        this(8);
    }

    @Override
    public double square() {
        return Math.PI*this.radius*this.radius;
    }


}
