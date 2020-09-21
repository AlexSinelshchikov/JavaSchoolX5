package Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruits> {
    private List<T> list = new ArrayList<>();

    public void addF (T fruit) {
        list.add(fruit);
    }

    public double getWeight () {
        double weightInBox;
        if (list.size() == 0) {
            weightInBox = 0;
        }
            else {
            weightInBox = list.size() * list.get(0).getWeight();
        }
            return weightInBox;
    }

    public boolean compare (Box secondBox) {
        if (secondBox == null) {
            return false;
        }
        else {
            return this.getWeight() == secondBox.getWeight();
        }
    }

    public void pourOverFruit (Box<T> secondBox) {
        for (int temp = 0; temp < list.size(); temp++ ) {
            secondBox.addF(list.get(temp));
        }
    }
    public void clear () {
        list.clear();
    }
}
