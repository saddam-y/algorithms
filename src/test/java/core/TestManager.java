package core;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManager {
    public static Stream<Arguments> getIntegersListForSorting() {
        return Stream.of(
                Arguments.of(new Integer[] {10, 34, 3, 2, 93, 12, 34, 2, 1212, 2 ,3, 3, 10, 4}, new Integer[] {2, 2, 2, 3, 3, 3, 4, 10, 10, 12, 34, 34, 93, 1212}),
                Arguments.of(new Integer[] {233, 233, 4, 54, 31, 2, 11, 7, 34, 4 ,4, 4, 100,100}, new Integer[] {2, 4, 4, 4, 4, 7, 11, 31, 34, 54, 100, 100, 233, 233})
        );
    }

    public static Stream<Arguments> getIntegersListForSearch() {
        return Stream.of(
                Arguments.of(new Integer[] {10, 34, 3, 2, 93, 12, 34, 2, 1212, 2 ,3, 3, 10, 4}, 34),
                Arguments.of(new Integer[] {233, 233, 4, 54, 31, 2, 11, 7, 34, 4 ,4, 4, 100,100}, 7)
        );
    }

}
