package Animal;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {

        System.out.println("Шуметь");
    }

    public void eat() {

        System.out.println("Кушать");
    }

    public void sleep() {

        System.out.println("Спать");
    }

    public void treatAnimal() {
        System.out.println(food + " " + location);
    }
}
