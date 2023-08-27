package sort;

public class LineReversal {

    public static String byToCharArray(String line) {

        char temp;
        char[] chars = line.toCharArray();
        var sizeCharsArray = (chars.length - 1);

        for(var i = 0; i < chars.length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[sizeCharsArray - i];
            chars[sizeCharsArray - i] = temp;
        }

        return new String(chars);
    }

    public static String byCharAt(String line) {
        char[] chars = new char[line.length()];
        var size = (chars.length - 1);

        for(var i = size; i >= 0; i--) {
            chars[size - i] = line.charAt(i);
        }

        return new String(chars);
    }

    public static String byStringBuffer(String line) {
        return new StringBuffer(line).reverse().toString();
    }
}
