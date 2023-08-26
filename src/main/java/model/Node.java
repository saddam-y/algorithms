package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> prev;

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
    public Node(T element, Node<T> next, Node<T> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
