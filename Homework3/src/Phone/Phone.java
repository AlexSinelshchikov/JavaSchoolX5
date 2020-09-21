package Phone;

public class Phone {

    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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
