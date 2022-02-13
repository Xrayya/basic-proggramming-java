package Edabit;

public class Switcharoo {
    public static void main(String[] args) {
        String res;

        res = flipEndChars("Cat, dog, and mouse.");
        System.out.println(res);

        res = flipEndChars("ada");
        System.out.println(res);

        res = flipEndChars("Ada");
        System.out.println(res);

        res = flipEndChars("z");
        System.out.println(res);

        res = flipEndChars("Cat, dog, and mouse.");
        System.out.println(res);

        res = flipEndChars("Anna, Banana");
        System.out.println(res);

        res = flipEndChars("[]");
        System.out.println(res);

        res = flipEndChars("");
        System.out.println(res);

        res = flipEndChars("dfdkf49824fdfdfjhd");
        System.out.println(res);

        res = flipEndChars("#343473847#");
        System.out.println(res);
    }

    public static String flipEndChars(String s) {
        if (s.length() <= 2) {
            return "Incompatible.";
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar == lastChar) {
            return "Two's a pair.";
        }

        return lastChar + s.substring(1, s.length() - 1) + firstChar;
    }
}
