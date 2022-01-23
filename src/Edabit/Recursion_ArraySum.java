package Edabit;

import java.util.Arrays;

public class Recursion_ArraySum {
    public static void main(String[] args) {
        int res;

        res = sum(new int[] { 1, 2, 3, 4 });
        System.out.println(res);

        res = sum(new int[] { 1, 2 });
        System.out.println(res);

        res = sum(new int[] { 1 });
        System.out.println(res);

        res = sum(new int[] {});
        System.out.println(res);
    }

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + sum(newArr);
    }
}
