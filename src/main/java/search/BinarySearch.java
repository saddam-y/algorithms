package search;

import java.util.Comparator;
public class BinarySearch {


    public static <T> T search(T searchElement, T[] arr, Comparator<T> comparator) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int compareResult;

        while(lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if((compareResult = comparator.compare(arr[midIndex], searchElement)) == 0) {
                return arr[midIndex];
            }else if(compareResult > 0){
                highIndex = midIndex - 1;
            }else if(compareResult < 0){
                lowIndex = midIndex + 1;
            }
        }

        return null;
    }

    public static <T> T searchUsingRecursion(T searchElement, T[] arr, Comparator<T> comparator) {
        return recursion(searchElement, arr, 0, arr.length - 1, comparator);
    }

    public static <T> T recursion(T searchElement, T[] arr, int lowIndex, int highIndex, Comparator<T> comparator) {
        var midIndex = (lowIndex + highIndex) / 2;
        int compareResult;

        if((compareResult = comparator.compare(arr[midIndex], searchElement)) == 0){
            return arr[midIndex];
        }else if(compareResult > 0) {
            return recursion(searchElement, arr, lowIndex, midIndex - 1, comparator);
        } else if(compareResult < 0) {
            return recursion(searchElement, arr, midIndex + 1, highIndex, comparator);
        }

        return null;
    }
}
