package structure.impl;

import structure.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {

    List<T> elements = new ArrayList<>();

    public void push(T element) {
        this.elements.add(element);
    }

    public T pop() throws NullPointerException {
        if(!isEmpty()) {
            return elements.remove(this.elements.size() - 1);
        }else {
            throw new NullPointerException();
        }
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
