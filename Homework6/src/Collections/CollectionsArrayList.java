package Collections;

import java.util.ArrayList;

public class CollectionsArrayList <E> {

    private final ArrayList<E> array;

    public CollectionsArrayList(ArrayList<E> array) {
        this.array = array;
    }

    public CollectionsArrayList () {
        array = new ArrayList<>();
    }

    public int size() {
        return array.size();
    }

    public void add(E item) {
        array.add(item);
    }

    public void remove (int index) {
        array.remove(index);
    }

    public void remove (E item) {
        array.remove(item);
    }

    public  E get (int index) {
        return array.get(index);
    }

    public void clear () {
        array.clear();
    }
}








