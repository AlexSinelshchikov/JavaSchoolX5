package Phone;

public class Phone {

    public long number;
    public String model;
    public double weight;

    public Phone(long number, String model, double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит" + " " + name);
    }

    public static void getNumber(long number) {
        System.out.println(number);
    }

    public void receiveCall(String name, long number) {
        System.out.println(name + " " + number);
    }

    public void sendMessage (long number, long... arg) {
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "Телефон{" +
                "номер=" + number +
                ", вес=" + weight +
                ", модель='" + model + '\'' +
                '}';
    }
}
