package Edabit;

public class FootballPrints {
    public static void main(String[] args) {
        int res;

        res = footballPoints(3, 4, 2);
        System.out.println(res);
        res = footballPoints(5, 0, 2);
        System.out.println(res);
        res = footballPoints(0, 0, 1);
        System.out.println(res);
    }

    public static int footballPoints(int wins, int draws, int loses) {
        return wins * 3 + draws * 1;
    }
}
