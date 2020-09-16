package Shape;

public class Rectangle implements Shape {

    public double width;
    public double height;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        this(3, 3);
    }

    @Override
    public double square() {
        return height * width;
    }
}

