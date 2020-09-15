package Animal;

public class Cat extends Animal {

    public String lengthOfHair;
    public int numberOfMiceCaughtPerWeek;
    public int hoursOfSleepPerDay;

    public Cat ( String food, String location, String lengthOfHair, int numberOfMiceCaughtPerWeek, int hoursOfSleepPerDay) {
        super(food, location);
        this.lengthOfHair = lengthOfHair;
        this.numberOfMiceCaughtPerWeek = numberOfMiceCaughtPerWeek;
        this.hoursOfSleepPerDay = hoursOfSleepPerDay;
    }

    public Cat () {
        this("Рыбка", "Квартира", "short hair", 6, 12);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка сказала Мяу");
    }

    @Override
    public void eat() {

        System.out.println("Кошка скушала рыбку");
    }

    @Override
    public void sleep() {

        System.out.println("Кошка спит");
    }
}
