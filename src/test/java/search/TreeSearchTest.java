package search;

import model.Tree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import search.TreeSearch;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tree Search")
class TreeSearchTest {

    @Test
    @DisplayName("Sum value using Recursion")
    void sumUsingRecursion() {
        var actualResult = TreeSearch.sumUsingRecursion(getTree());
        assertEquals(274, actualResult);
    }

    @Test
    @DisplayName("Search value using Recursion")
    void searchUsingRecursion() {
        var actualResult = TreeSearch.searchUsingRecursion(40, getTree());
        assertAll(
                () -> assertEquals(40, actualResult.getValue()),
                () -> assertEquals(38, actualResult.getLeft().getValue()),
                () -> assertEquals(53, actualResult.getRight().getValue())
        );
    }

    @Test
    @DisplayName("Sum using Stack")
    void sumUsingStackDeep() {
        var actualResult = TreeSearch.sumUsingStackDeep(getTree());
        assertEquals(274, actualResult);
    }

    @Test
    @DisplayName("Search value using Stack")
    void searchUsingStack() {
        var actualResult = TreeSearch.searchUsingStackDeep(40, getTree());
        assertAll(
                () -> assertEquals(40, actualResult.getValue()),
                () -> assertEquals(38, actualResult.getLeft().getValue()),
                () -> assertEquals(53, actualResult.getRight().getValue())
        );
    }

    @Test
    @DisplayName("Sum using Queue")
    void sumUsingQueueDeep() {
        var actualResult = TreeSearch.sumUsingQueueWide(getTree());
        assertEquals(274, actualResult);
    }


    private Tree<Integer> getTree() {
        return new Tree<>(20,
                new Tree<>(7,
                        new Tree<>(4, null, new Tree<>(7)),
                        new Tree<>(10)),
                new Tree<>(35,
                        new Tree<>(31, new Tree<>(29), null),
                        new Tree<>(40, new Tree<>(38), new Tree<>(53))));
    }
}
