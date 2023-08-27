package sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LineReversalTest {

    private static final String STRING = "Hello, World";
    private static final String REVERSE_STRING = "dlroW ,olleH";
    @Test
    @DisplayName("Line Reversal by String.toCharArray()")
    void byToCharArray() {
        var actualResult = LineReversal.byToCharArray(STRING);
        assertEquals(REVERSE_STRING, actualResult);
    }

    @Test
    @DisplayName("Line Reversal by String.charAt()")
    void byCharAt() {
        var actualResult = LineReversal.byCharAt(STRING);
        assertEquals(REVERSE_STRING, actualResult);
    }

    @Test
    @DisplayName("Line Reversal by StringBuffer")
    void byStringBuffer() {
        var actualResult = LineReversal.byStringBuffer(STRING);
        assertEquals(REVERSE_STRING, actualResult);
    }

}
