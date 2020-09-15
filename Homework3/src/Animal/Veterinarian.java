package Animal;

public class Veterinarian extends Animal {

    public Veterinarian(String food, String location) {

        super(food, location);
    }

    public void treatAnimal(Animal[] animal) {
        System.out.println(food + " " + location);
    }
}
