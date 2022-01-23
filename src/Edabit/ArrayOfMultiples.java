package Edabit;

import java.util.Arrays;

public class ArrayOfMultiples {
    public static void main(String[] args) {
        int[] res;

        res = arrayOfMultiples(7, 5);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(12, 10);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(17, 6);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(7, 5);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(12, 10);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(17, 7);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(630, 14);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(140, 3);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(7, 8);
        System.out.println(Arrays.toString(res));

        res = arrayOfMultiples(11, 21);
        System.out.println(Arrays.toString(res));
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num * (i + 1);
        }

        return arr;
    }
}
