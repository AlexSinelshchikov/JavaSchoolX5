package Car;

public class SportCar extends Car {
    private double topSpeed;

    public SportCar (String carModel, String carClass, double carWeight, Engine carMotor, double topSpeed) {
        super (carModel, carClass, carWeight, carMotor);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public SportCar() {
        super("Veyron", "SportCar", 1888, new Engine(1001, "Bugatti"));
        this.topSpeed = 407;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {

        System.out.println("Модель автомобиля: " + getCarModel() + ". Класс: " + getCarClass() + ". Вес: " + getCarWeight() + getCarMotor() + ". Максимальная скорость: " + topSpeed);
    }
}
