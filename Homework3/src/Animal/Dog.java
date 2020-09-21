package Animal;

public class Dog extends Animal {

    private String character;
    private String profession;

    public Dog (String food, String location, String character, String profession) {
        super(food, location);
        this.character = character;
        this.profession = profession;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
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
