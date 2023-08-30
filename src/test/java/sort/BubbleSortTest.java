package sort;

import core.TestManager;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @ParameterizedTest
    @MethodSource("getArguments")
    public void bubbleSort(Integer[] arguments, Integer[] expectedResult){
        var actuallyArray = BubbleSort.bubbleSort(arguments, Integer::compare);
        assertArrayEquals(expectedResult, actuallyArray);
    }

    public static Stream<Arguments> getArguments() {
        return TestManager.getIntegersListForSorting();
    }

}
