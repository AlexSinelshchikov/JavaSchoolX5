package Shape;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
        this(3, 3);
    }

    @Override
    public double square() {
        return height * width;
    }
}

