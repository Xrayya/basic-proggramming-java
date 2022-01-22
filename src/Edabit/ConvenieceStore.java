package Edabit;

public class ConvenieceStore {
    public static void main(String[] args) {
        boolean res;

        res = changeEnough(new int[] { 2, 100, 0, 0 }, 14.11);
        System.out.println(res);

        res = changeEnough(new int[] { 0, 0, 20, 5 }, 0.75);
        System.out.println(res);

        res = changeEnough(new int[] { 30, 40, 20, 5 }, 12.55);
        System.out.println(res);

        res = changeEnough(new int[] { 10, 0, 0, 50 }, 13.85);
        System.out.println(res);

        res = changeEnough(new int[] { 1, 0, 5, 219 }, 19.99);
        System.out.println(res);

        res = changeEnough(new int[] { 1, 0, 2555, 219 }, 127.75);
        System.out.println(res);

        res = changeEnough(new int[] { 1, 335, 0, 219 }, 35.21);
        System.out.println(res);
    }

    public static boolean changeEnough(int[] change, double amountDue) {
        System.out.println(change[0] * 0.25);
        System.out.println(change[1] * 0.10);
        System.out.println(change[2] * 0.05);
        System.out.println(change[3] * 0.01);
        double total = change[0] * 0.25 + change[1] * 0.10 + change[2] * 0.05 + change[3] * 0.01;
        System.out.println(total);
        return total == amountDue ? true : false;
    }
}
