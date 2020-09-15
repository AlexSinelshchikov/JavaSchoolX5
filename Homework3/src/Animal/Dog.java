package Animal;

public class Dog extends Animal {

    public String character;
    public String profession;

    public Dog (String food, String location, String character, String profession) {
        super(food, location);
        this.character = character;
        this.profession = profession;
    }

    public Dog () {
        this ("Косточка", "Конура", "kind", "home security");
    }

    @Override
    public void makeNoise() {

        System.out.println("Собака сказала Гав");
    }

    @Override
    public void eat() {

        System.out.println("Собака скушала косточку");
    }

    @Override
    public void sleep() {

        System.out.println("Собака спит");
    }
}
