package sort;

import java.util.Arrays;
public class BubbleSort {

    public static int[] bubbleSort(int[] intArr) {
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

        return intArr;
    }
}
