package sort;

import core.TestManager;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @ParameterizedTest
    @MethodSource("getArguments")
    void quickSort(Integer[] arguments, Integer[] expectedResult) {
            QuickSort.quickSort(arguments, Integer::compare);
            assertArrayEquals(expectedResult, arguments);
    }


    public static Stream<Arguments> getArguments() {
        return TestManager.getIntegers();
    }
}
