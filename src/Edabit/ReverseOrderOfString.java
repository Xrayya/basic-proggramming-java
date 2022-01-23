package Edabit;

public class ReverseOrderOfString {
    public static void main(String[] args) {
        String res;

        res = reverse("Hello World");
        System.out.println(res);

        res = reverse("The quick brown fox.");
        System.out.println(res);

        res = reverse("Edabit is really helpful!");
        System.out.println(res);
    }

    public static String reverse(final String str) {
        String[] chars = str.split("");
        String res = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            res += chars[i];
        }

        return res;
    }
}
