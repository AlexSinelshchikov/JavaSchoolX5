package Car;

public class Engine {
    double carPower;
    String carBrand;

    public Engine (double carPower, String carBrand) {
        this.carPower = carPower;
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return ". Мощность мотора: " + carPower + ". Брэнд: " + carBrand;

    }
}
