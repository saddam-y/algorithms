package sort;

import java.util.Arrays;
public class BubbleSortMain {

    public static void main(String[] args) {
        int[] arrInt = new int[] {10, 34, 3, 2, 93, 12, 34, 2, 1212,2 ,3, 3, 10, 4};
        sort(arrInt);
        print(arrInt);
    }

    public static void sort(int[] intArr) {
        int temp;
        boolean again;

        for(var i = 0; i < intArr.length; i++) {
            again = false;
            for(var j = 0; j < intArr.length - i - 1; j++) {
                if(intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                    again = true;
                }
            }
            if(!again) break;
        }
    }

    public static void print(int[] intArr) {
        Arrays.stream(intArr).forEach(i -> System.out.print(i + " "));
    }
}
