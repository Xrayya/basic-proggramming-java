package Edabit;

public class DifferenceOfMaxMinInArr {
    public static void main(String[] args) {
        int res;

        res = differenceMaxMin(new int[] { 10, 4, 1, 2, 8, 91 });
        System.out.println(res);

        res = differenceMaxMin(new int[] { -70, 43, 34, 54, 22 });
        System.out.println(res);

        res = differenceMaxMin(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 });
        System.out.println(res);

        res = differenceMaxMin(new int[] { 44, 32, 86, 19 });
        System.out.println(res);
    }

    public static int differenceMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        return max - min;
    }
}
