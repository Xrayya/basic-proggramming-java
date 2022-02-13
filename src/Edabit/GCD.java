package Edabit;

public class GCD {
    public static void main(String[] args) {
        int res;
        res = gcd(3, 5);
        System.out.println(res);

        res = gcd(14, 28);
        System.out.println(res);

        res = gcd(4, 18);
        System.out.println(res);

        res = gcd(6, 10);
        System.out.println(res);

        res = gcd(17, 85);
        System.out.println(res);

        res = gcd(18, 153);
        System.out.println(res);

        res = gcd(14, 14);
        System.out.println(res);

        res = gcd(6, 31);
        System.out.println(res);
    }

    public static int gcd(int a, int b) {
        int res = 1;
        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                res = i;
                break;
            }
        }

        return res;
    }
}
