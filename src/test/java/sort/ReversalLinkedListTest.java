package sort;

import model.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversalLinkedListTest {


    @Test
    @DisplayName("Reverse Using Loop for two-linked list")
    void reverseTwoLinkedUsingLoop() {
        var nodes = ReversalLinkedList.reverseUsingLoop(getNodesTwoLinkedList());
        checkReverseTwoLinkedList(nodes);
    }

    @Test
    @DisplayName("Reverse Using Loop")
    void reverseUsingLoop() {
        var nodes = ReversalLinkedList.reverseUsingLoop(getNodes());
        checkReverseLinkedList(nodes);
    }

    @Test
    @DisplayName("Reverse Using Recursion")
    void reverseUsingRecursion() {
        var nodes = ReversalLinkedList.reverseUsingRecursion(getNodes());
        checkReverseLinkedList(nodes);
    }

    @Test
    @DisplayName("Reverse Using Recursion for Two-Linked list")
    void reverseTwoLinkedUsingRecursion() {
        var nodes = ReversalLinkedList.reverseUsingRecursion(getNodesTwoLinkedList());
        checkReverseTwoLinkedList(nodes);
    }

    private Node<Integer> getNodes() {
        return new Node<Integer>(3, new Node<Integer>(10, new Node<Integer>(20, new Node<Integer>(3, new Node<Integer>(88, new Node<Integer>(11, null))))));
    }
    private void checkReverseLinkedList(Node<Integer> node) {
        assertAll(
                () -> assertTrue(node.getElement().equals(11)),
                () -> assertTrue(node.getNext().getElement().equals(88)),
                () -> assertTrue(node.getNext().getNext().getElement().equals(3)),
                () -> assertTrue(node.getNext().getNext().getNext().getElement().equals(20)),
                () -> assertTrue(node.getNext().getNext().getNext().getNext().getElement().equals(10)),
                () -> assertTrue(node.getNext().getNext().getNext().getNext().getNext().getElement().equals(3))
        );
    }
    private Node<Integer> getNodesTwoLinkedList() {
        var node1 = new Node<Integer>(1);
        var node2 = new Node<Integer>(33);
        var node3 = new Node<Integer>(2, null, node2);
        node2.setNext(node3);
        node2.setPrev(node1);
        node1.setNext(node2);
        return node1;
    }
    private void checkReverseTwoLinkedList(Node<Integer> node) {
        assertAll(
                () -> assertTrue(node.getElement().equals(2)),
                () -> assertTrue(node.getNext().getElement().equals(33)),
                () -> assertTrue(node.getNext().getPrev().getElement().equals(2)),
                () -> assertTrue(node.getNext().getNext().getElement().equals(1)),
                () -> assertTrue(node.getNext().getNext().getPrev().getElement().equals(33))
        );
    }
}
