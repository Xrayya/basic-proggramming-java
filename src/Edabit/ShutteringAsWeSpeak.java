package Edabit;

public class ShutteringAsWeSpeak {
    public static void main(String[] args) {
        String res;

        res = stuttering("astonishing");
        System.out.println(res);

        res = stuttering("enticing");
        System.out.println(res);

        res = stuttering("dazzling");
        System.out.println(res);
    }

    public static String stuttering(String word) {
        String shutter = word.substring(0, 2);

        return shutter + "... " + shutter + "... " + word + "!";
    }
}
