package Car;

public abstract class Car {
    String carModel;
    String carClass;
    double carWeight;
    Engine carMotor;

    public Car(String carModel, String carClass, double carWeight, Engine carMotor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.carMotor = carMotor;
    }

    public abstract void start();


    public abstract void stop();


    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}
