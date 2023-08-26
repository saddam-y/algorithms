package sort;

import model.Node;

public class ReversalLinkedList {
    public static <T> Node<T> reverseUsingLoop(Node<T> head) {
        Node<T> prev = null;
        Node<T> temp;
        Node<T> curr = head;

        while(curr != null) {
            temp = curr.getNext();
            curr.setNext(prev);
            curr.setPrev(temp); /* For Two-Linked List */
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static <T> Node<T> reverseUsingRecursion(Node<T> head) {
        return recursive(null, head);
    }

    public static <T> Node<T> recursive(Node<T> prev, Node<T> curr) {
        if(curr == null) return prev;
        Node<T> next = curr.getNext();
        curr.setNext(prev);
        curr.setPrev(next); /* For Two-Linked List */
        return recursive(curr, next);
    }


}
