package week3;

public class practical {
    public static String removeX(String string) {
        if (string.length() == 0) {
            return string;
        }
        if (string.charAt(0) != 'X' && string.charAt(0) != 'x') {
            return string.charAt(0) + removeX(string.substring(1));
        } return removeX(string.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(removeX("abxcx"));

    }
}
