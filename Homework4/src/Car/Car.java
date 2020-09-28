package Car;

public abstract class Car {
   private String carModel;
   private String carClass;
   private double carWeight;
   private Engine carMotor;

    public Car(String carModel, String carClass, double carWeight, Engine carMotor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.carMotor = carMotor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public Engine getCarMotor() {
        return carMotor;
    }

    public void setCarMotor(Engine carMotor) {
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
