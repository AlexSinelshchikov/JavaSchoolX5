package Car;

public class Engine {
    private double carPower;
    private String carBrand;

    public Engine (double carPower, String carBrand) {
        this.carPower = carPower;
        this.carBrand = carBrand;
    }

    public double getCarPower() {
        return carPower;
    }

    public void setCarPower(double carPower) {
        this.carPower = carPower;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return ". Мощность мотора: " + carPower + ". Брэнд: " + carBrand;

    }
}
