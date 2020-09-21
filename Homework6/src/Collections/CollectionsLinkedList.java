package Collections;

import java.util.LinkedList;

public class CollectionsLinkedList <E> {

    private final LinkedList<E> list;

    public CollectionsLinkedList(LinkedList<E> list) {
        this.list = list;
    }

    public CollectionsLinkedList () {
        list = new LinkedList<> ();
    }

    public int size() {
        return list.size();
    }

    public void add(E item) {
        list.add(item);
    }

    public void remove (int index) {
        list.remove(index);
    }

    public void remove (E item) {
        list.remove(item);
    }

    public  E get (int index) {
        return list.get(index);
    }

    public void clear () {
        list.clear();
    }
}
