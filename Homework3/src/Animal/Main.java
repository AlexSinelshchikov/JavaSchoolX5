package Animal;

public class Main {
    public static void main(String[] args) {

        Animal max = new Dog();
        Animal lightning = new Horse();
        Animal alica = new Cat();

        max.sleep();
        lightning.sleep();
        alica.sleep();

        Animal[] animal = new Animal[3];
        animal[0] = alica;
        animal[1] = lightning;
        animal[2] = max;

        for (int i = 0; i < animal.length; i++) {
            animal[i].treatAnimal();
        }
    }
}
