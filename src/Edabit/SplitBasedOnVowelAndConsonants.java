package Edabit;

public class SplitBasedOnVowelAndConsonants {
    public static void main(String[] args) {
        String res;

        res = split("abcde");
        System.out.println(res);

        res = split("Hello!");
        System.out.println(res);

        res = split("What's the time?");
        System.out.println(res);
    }

    public static String split(String str) {
        String res;

        String vowels = "";
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowels += str.charAt(i);
            }
        }

        res = vowels;
        String[] chars = str.split("");

        return res;
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
                return true;
            case 'i':
                return true;
            case 'u':
                return true;
            case 'e':
                return true;
            case 'o':
                return true;
            default:
                return false;
        }
    }
}
