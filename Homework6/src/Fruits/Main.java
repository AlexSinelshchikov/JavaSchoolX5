package Fruits;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.addF(new Apple());
        appleBox.addF(new Apple());
        appleBox.addF(new Apple());
        appleBox.addF(new Apple());

        System.out.println("Вес корзины с яблоками равен - " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box <Orange>();
        orangeBox.addF(new Orange());
        orangeBox.addF(new Orange());
        orangeBox.addF(new Orange());
        orangeBox.addF(new Orange());
        orangeBox.addF(new Orange());

        System.out.println("Вес корзины с апельсинами равен - " + orangeBox.getWeight());
        System.out.println("Равен вес коробок с фруктами? " + appleBox.compare(orangeBox));

        Box<Orange> secondBox = new Box<Orange>();

        orangeBox.pourOverFruit(secondBox);
    }
}

