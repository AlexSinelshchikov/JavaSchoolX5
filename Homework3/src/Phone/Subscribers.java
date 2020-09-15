package Phone;

public class Subscribers extends Phone {

    public static void main(String[] args) {

        Phone nokia = new Phone(89097245859L, "nokia", 124.5);
        Phone samsung = new Phone(89011234587L, "samsung", 136.3d);
        Phone sony = new Phone(89772354782L, "sony", 112.6d);

        System.out.println(nokia.number + " " + nokia.model + " " + nokia.weight);
        System.out.println(samsung.number + " " + samsung.model + " " + samsung.weight);
        System.out.println(sony.number + " " + sony.model + " " + samsung.weight);

        nokia.receiveCall("Юра Хой");
        samsung.receiveCall("Виктор Цой");
        sony.receiveCall("Фредди Меркьюри");

        getNumber(nokia.number);
        getNumber(samsung.number);
        getNumber(sony.number);

        nokia.receiveCall("Юра Хой", 89097245859L);
        samsung.receiveCall("Виктор Цой", 89011234587L);
        sony.receiveCall("Фредди Меркьюри", 89772354782L);

        nokia.sendMessage(89097245859L);
        samsung.sendMessage(89011234587L);
        sony.sendMessage(89772354782L);
    }
}
