package Animal;

public class Horse extends Animal {

    private int runningSpeedKmCh;
    private String color;
    private String destined;

    public Horse (String food, String location, String color, String destined, int runningSpeedKmCh) {
        super(food,location );
        this.color = color;
        this.destined = destined;
        this.runningSpeedKmCh = runningSpeedKmCh;
    }

    public int getRunningSpeedKmCh() {
        return runningSpeedKmCh;
    }

    public void setRunningSpeedKmCh(int runningSpeedKmCh) {
        this.runningSpeedKmCh = runningSpeedKmCh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDestined() {
        return destined;
    }

    public void setDestined(String destined) {
        this.destined = destined;
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
