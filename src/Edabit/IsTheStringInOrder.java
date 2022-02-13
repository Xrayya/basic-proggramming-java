package Edabit;

import java.util.Arrays;

public class IsTheStringInOrder {
    public static void main(String[] args) {
        boolean res;

        res = isInOrder("abc");
        System.out.println(res);

        res = isInOrder("edabit");
        System.out.println(res);

        res = isInOrder("123");
        System.out.println(res);

        res = isInOrder("xyzz");
        System.out.println(res);
    }

    public static boolean isInOrder(String str) {
        String[] chars = str.split("");
        Arrays.sort(chars);
        String ordered = "";

        for (String string : chars) {
            ordered += string;
        }

        return str.equals(ordered);
    }
}
