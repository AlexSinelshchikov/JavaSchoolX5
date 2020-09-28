package Car;

public class Lorry extends Car {

    private double lorryCarrying;

    public Lorry(String carModel, String carClass, double carWeight, double lorryCarrying, Engine carMotor) {
        super(carModel, carClass, carWeight, carMotor);
        this.lorryCarrying = lorryCarrying;
    }

    public double getLorryCarrying() {
        return lorryCarrying;
    }

    public void setLorryCarrying(double lorryCarrying) {
        this.lorryCarrying = lorryCarrying;
    }

    public Lorry() {
        super("FH16", "Lorry", 35000, new Engine(750, "Volvo"));
        this.lorryCarrying = 44000;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель автомобиля: " + getCarClass() + ". Класс: " + getCarClass() + ". Вес: " + getCarWeight() + getCarMotor() + ". Грузоподъемность: " + lorryCarrying);
    }
}
