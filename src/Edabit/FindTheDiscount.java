package Edabit;

public class FindTheDiscount {
    public static void main(String[] args) {
        double res;

        res = discount(1500, 50);
        System.out.println(res);

        res = discount(89, 20);
        System.out.println(res);

        res = discount(100, 75);
        System.out.println(res);

        res = discount(100, 75);
        System.out.println(res);

        res = discount(211, 50);
        System.out.println(res);

        res = discount(593, 61);
        System.out.println(res);

        res = discount(1693, 80);
        System.out.println(res);

        res = discount(700, 10);
        System.out.println(res);
    }

    public static double discount(int price, int percentage) {
        return (double) price * (100 - percentage) / 100;
    }
}
