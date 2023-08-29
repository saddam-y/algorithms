package sort;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

    public static <T> T[] bubbleSort(T[] arr, Comparator<T> comparator) {
        T temp;
        boolean again;

        for(var i = 0; i < arr.length; i++) {
            again = false;
            for(var j = 0; j < arr.length - i - 1; j++) {
                if(comparator.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    again = true;
                }
            }
            if(!again) break;
        }

        return arr;
    }

}
