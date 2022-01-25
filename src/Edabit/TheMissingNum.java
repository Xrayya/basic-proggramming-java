package Edabit;

import java.util.Arrays;

public class TheMissingNum {
    public static void main(String[] args) {
        int res;

        res = missingNum(new int[] { 7, 2, 3, 6, 5, 9, 1, 4, 8 });
        System.out.println(res);

        res = missingNum(new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 });
        System.out.println(res);

        res = missingNum(new int[] { 10, 5, 1, 2, 4, 6, 8, 3, 9 });
        System.out.println(res);

        res = missingNum(new int[] { 7, 2, 3, 6, 5, 9, 1, 4, 8 });
        System.out.println(res);

        res = missingNum(new int[] { 10, 5, 1, 2, 4, 6, 8, 3, 9 });
        System.out.println(res);

        res = missingNum(new int[] { 1, 7, 2, 4, 8, 10, 5, 6, 9 });
        System.out.println(res);

    }

    public static int missingNum(int[] nums) {
        Arrays.sort(nums);
        int res = 10;
        for (int i = 0; i < 9; i++) {
            if (i + 1 != nums[i]) {
                res = i + 1;
                break;
            }
        }

        return res;
    }
}
