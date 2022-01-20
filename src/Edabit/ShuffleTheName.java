package Edabit;

public class ShuffleTheName {
    public static void main(String[] args) {
        String res;

        res = nameShuffle("Donald Trump");
        System.out.println(res);

        res = nameShuffle("Rosie O'Donnell");
        System.out.println(res);

        res = nameShuffle("Seymour Butts");
        System.out.println(res);
    }

    public static String nameShuffle(String s) {
        String[] words = s.split(" ");
        String res = "";

        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i] + " ";
        }

        return res;
    }
}
