package Edabit;

public class EndingMatch {
    public static void main(String[] args) {
        boolean res;

        res = checkEnding("abc", "bc");
        System.out.println(res);

        res = checkEnding("abc", "d");
        System.out.println(res);

        res = checkEnding("samurai", "zi");
        System.out.println(res);

        res = checkEnding("feminine", "nine");
        System.out.println(res);

        res = checkEnding("convention", "tio");
        System.out.println(res);
    }

    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2) ? true : false;
    }
}
