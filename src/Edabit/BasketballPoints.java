package Edabit;

public class BasketballPoints {
    public static void main(String[] args) {
        int res;

        res = points(13, 12);
        System.out.println(res);
        res = points(17, 12);
        System.out.println(res);
        res = points(38, 8);
        System.out.println(res);
    }

    public static int points(int twos, int threes) {
        return twos * 2 + threes * 3;
    }
}
