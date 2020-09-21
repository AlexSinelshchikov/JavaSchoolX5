package Animal;

public class Cat extends Animal {

    private String lengthOfHair;
    private int numberOfMiceCaughtPerWeek;
    private int hoursOfSleepPerDay;

    public Cat ( String food, String location, String lengthOfHair, int numberOfMiceCaughtPerWeek, int hoursOfSleepPerDay) {
        super(food, location);
        this.lengthOfHair = lengthOfHair;
        this.numberOfMiceCaughtPerWeek = numberOfMiceCaughtPerWeek;
        this.hoursOfSleepPerDay = hoursOfSleepPerDay;
    }

    public String getLengthOfHair() {
        return lengthOfHair;
    }

    public void setLengthOfHair(String lengthOfHair) {
        this.lengthOfHair = lengthOfHair;
    }

    public int getNumberOfMiceCaughtPerWeek() {
        return numberOfMiceCaughtPerWeek;
    }

    public void setNumberOfMiceCaughtPerWeek(int numberOfMiceCaughtPerWeek) {
        this.numberOfMiceCaughtPerWeek = numberOfMiceCaughtPerWeek;
    }

    public int getHoursOfSleepPerDay() {
        return hoursOfSleepPerDay;
    }

    public void setHoursOfSleepPerDay(int hoursOfSleepPerDay) {
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
