package Edabit;

public class FindTheBomb {
    public static void main(String[] args) {
        String res;

        res = bomb("There is a bomb.");
        System.out.println(res);

        res = bomb("Hey, did you think there is a BOMB?");
        System.out.println(res);

        res = bomb("This goes boom!!!");
        System.out.println(res);
    }

    public static String bomb(String str) {
        return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }
}
