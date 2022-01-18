package Edabit;

public class TrueCounter {
    public static void main(String[] args) {
        int res;

        boolean[] arr1 = { true, false, false, true, false };
        res = countTrue(arr1);
        System.out.println(res);

        boolean[] arr2 = { false, false, false, false };
        res = countTrue(arr2);
        System.out.println(res);

        boolean[] arr3 = {};
        res = countTrue(arr3);
        System.out.println(res);
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (boolean b : arr) {
            if (b) {
                count++;
            }
        }

        return count;
    }
}
