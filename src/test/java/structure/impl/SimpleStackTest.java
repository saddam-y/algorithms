package structure.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import structure.Stack;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Simple Stack")
class SimpleStackTest {

    @Test
    @DisplayName("push and pop")
    void workStack() {
        Stack<Integer> stack = new SimpleStack<>();
        stack.push(12);
        stack.push(13);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(13, stack.pop());
        assertEquals(12, stack.pop());
    }
}
