package Edabit;

public class PentagonalNum {
    public static void main(String[] args) {
        int res;

        res = pentagonal(1);
        System.out.println(res);

        res = pentagonal(2);
        System.out.println(res);

        res = pentagonal(3);
        System.out.println(res);

        res = pentagonal(8);
        System.out.println(res);

        res = pentagonal(10);
        System.out.println(res);

        res = pentagonal(15);
        System.out.println(res);

        res = pentagonal(33);
        System.out.println(res);

        res = pentagonal(43);
        System.out.println(res);

        res = pentagonal(13);
        System.out.println(res);

        res = pentagonal(50);
        System.out.println(res);

        res = pentagonal(62);
        System.out.println(res);

        res = pentagonal(21);
        System.out.println(res);

    }

    public static int pentagonal(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        return 5 * (num - 1) + pentagonal(num - 1);
    }
}
