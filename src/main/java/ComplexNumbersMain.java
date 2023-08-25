
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;

public class ComplexNumbersMain {

    public static void main(String[] args) {
        for (int n = 1; n < Integer.MAX_VALUE; n++) {
            if (!checkEqualNaturalismNumber(n)) {
                System.out.println(n);
                break;
            }
        }
    }

    public static boolean checkEqualNaturalismNumber(int n) {
        for (int k = 1; k < Integer.MAX_VALUE; k++) {
            if (getEquation(k) == n) return true;
        }

        return false;
    }

    /**
     * 3k/S(k)^2
     */
    public static double getEquation(int k) {
        return (3 * k) / Math.pow(getSum(k), 2);
    }

    public static int getSum(int number) {
        int result = 0;
        var strNumber = String.valueOf(number);

        for (var i = 0; i < strNumber.length(); i++) {
            result += Integer.parseInt("" + strNumber.charAt(i));
        }

        return result;
    }
}
