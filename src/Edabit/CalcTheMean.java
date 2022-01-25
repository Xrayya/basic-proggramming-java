package Edabit;

public class CalcTheMean {
    public static void main(String[] args) {
        double res;

        res = mean(new int[] { 1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 2, 3, 2, 3 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 3, 3, 3, 3, 3 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 324, 543, 654, 9876 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 0, 0, 0, 0 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 30, 40, 20, 100, 30 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 1, 1, 1, 0 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 1, 1, 0, 1, 2, 1, 1, 1, 0, 0 });
        System.out.printf("%.2f\n", res);

        res = mean(new int[] { 10000 });
        System.out.printf("%.2f\n", res);

    }

    public static double mean(int[] nums) {
        int n = nums.length;
        double total = 0;

        for (int i : nums) {
            total += i;
        }

        return total / n;
    }
}
