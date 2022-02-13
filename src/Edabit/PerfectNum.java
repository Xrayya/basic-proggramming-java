package Edabit;

public class PerfectNum {
    public static void main(String[] args) {
        boolean res;

        res = checkPerfect(6);
        System.out.println(res);

        res = checkPerfect(6);
        System.out.println(res);

        res = checkPerfect(28);
        System.out.println(res);

        res = checkPerfect(496);
        System.out.println(res);

        res = checkPerfect(12);
        System.out.println(res);

        res = checkPerfect(97);
        System.out.println(res);

        res = checkPerfect(8128);
        System.out.println(res);

        res = checkPerfect(33550336);
        System.out.println(res);

        res = checkPerfect(12);
        System.out.println(res);

        res = checkPerfect(97);
        System.out.println(res);

        res = checkPerfect(481);
        System.out.println(res);

        res = checkPerfect(1001);
        System.out.println(res);

        res = checkPerfect(55555);
        System.out.println(res);
    }

    public static boolean checkPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num ? true : false;
    }
}
