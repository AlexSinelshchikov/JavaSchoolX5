package Animal;

public class Horse extends Animal {

    public int runningSpeedKmCh;
    public String color;
    public String destined;

    public Horse (String food, String location, String color, String destined, int runningSpeedKmCh) {
        super(food,location );
        this.color = color;
        this.destined = destined;
        this.runningSpeedKmCh = runningSpeedKmCh;
    }

    public Horse( ) {
        this("Трава", "Конюшня", "brown", "race", 60);
    }

    @Override
    public void makeNoise() {

        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {

        System.out.println("Лошадь скушала травку");
    }

    @Override
    public void sleep() {

        System.out.println("Лошадь спит");
    }
}
