package structure.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import structure.Queue;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Simple Queue")
class SimpleQueueTest {

    @Test
    @DisplayName("add and remove")
    void remove() {
        Queue<Integer> queue = new SimpleQueue<>();
        queue.add(99);
        queue.add(3);
        queue.add(17);

        assertEquals(99, queue.remove());
        assertEquals(3, queue.remove());
        assertEquals(17, queue.remove());
    }
}
