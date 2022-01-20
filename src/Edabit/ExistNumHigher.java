package Edabit;

public class ExistNumHigher {

    public static void main(String[] args) {
        boolean res;

        int[] arr1 = { 5, 3, 15, 22, 4 };
        res = existsHigher(arr1, 10);
        System.out.println(res);

        int[] arr2 = { 1, 2, 3, 4, 5 };
        res = existsHigher(arr2, 8);
        System.out.println(res);

        int[] arr3 = { 4, 3, 3, 3, 2, 2, 2 };
        res = existsHigher(arr3, 4);
        System.out.println(res);

        int[] arr4 = {};
        res = existsHigher(arr4, 5);
        System.out.println(res);
    }

    public static boolean existsHigher(int[] arr, int n) {
        boolean res = false;

        for (int i : arr) {
            if (n >= i) {
                res = true;
                break;
            }
        }

        return res;
    }
}