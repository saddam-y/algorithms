package sort;

import java.util.Comparator;

public class QuickSort {

    public static <T> void quickSort(T[] arr, Comparator<T> comparator) {
        quickSort(arr, 0, arr.length - 1, comparator);
    }
    private static <T> void quickSort(T[] arr, int begin, int end, Comparator<T> comparator) {
        if(begin < end) {
            var partitionIndex = partition(arr, begin, end, comparator);

            quickSort(arr, begin, partitionIndex - 1, comparator);
            quickSort(arr, partitionIndex, end, comparator);
        }
    }

    private static <T> int partition(T[] arr, int begin, int end, Comparator<T> comparator) {
        var pivot = arr[end];
        var i = begin;
        T swap;

        for(var j = begin; j < end; j++) {
            if(comparator.compare(pivot, arr[j]) >= 0) {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
            }
        }

        swap = arr[i];
        arr[i] = arr[end];
        arr[end] = swap;

        return i;
    }
}
