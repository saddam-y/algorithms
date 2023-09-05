package sort;

import graph.TopologicalSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Topological Sort for acyclic graph")
class TopologicalSortTest {

    @Test
    @DisplayName("Topological Sort")
    void sort() {
        Map<Integer, List<Integer>> tree = new HashMap<>();

        tree.put(1, List.of(3,5));
        tree.put(5, List.of(2,3,6));
        tree.put(3, List.of(2));
        tree.put(7, List.of(6));

        List<Integer> expectedResult = List.of(7, 4, 1, 5, 6, 3, 2);
        List<Integer> actualResult = TopologicalSort.sort(tree, List.of(1, 2, 3, 4, 5, 6, 7));

        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());

    }
}
