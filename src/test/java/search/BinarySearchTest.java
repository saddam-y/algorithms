package search;

import core.TestManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sort.QuickSort;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Binary Search")
class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("getArguments")
    @DisplayName("sort")
    void search(Integer[] arr, Integer expectedResult) {
        QuickSort.quickSort(arr, Integer::compare);
        var actualResult = BinarySearch.search(expectedResult, arr, Integer::compare);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    @DisplayName("sort using recursion")
    void searchUsingRecursion(Integer[] arr, Integer expectedResult) {
        QuickSort.quickSort(arr, Integer::compare);
        var actualResult = BinarySearch.searchUsingRecursion(expectedResult, arr, Integer::compare);
        assertEquals(expectedResult, actualResult);
    }


    public static Stream<Arguments> getArguments(){
        return TestManager.getIntegersListForSearch();
    }
}
