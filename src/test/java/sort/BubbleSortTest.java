package sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    @DisplayName("Test Bubble Sort")
    public void bubbleSort(){
        var actuallyArray = BubbleSort.bubbleSort(getActuallyArray());
        checkBubbleSort(actuallyArray);
    }
    private int[] getActuallyArray() {
        return new int[] {10, 34, 3, 2, 93, 12, 34, 2, 1212, 2 ,3, 3, 10, 4};
    }
    private int[] getExpectedArray() {
        return new int[] {2, 2, 2, 3, 3, 3, 4, 10, 10, 12, 34, 34, 93, 1212};
    }

    private void checkBubbleSort(int[] actuallyArray) {
       var expectedArray = getExpectedArray();
       for(int i = 0; i < actuallyArray.length; i++) {
           assertEquals(actuallyArray[i], expectedArray[i]);
       }
    }
}
