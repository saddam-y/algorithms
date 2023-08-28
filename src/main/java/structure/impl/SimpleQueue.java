package structure.impl;

import structure.Queue;
import java.util.List;
import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {

    List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public T remove() {
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
