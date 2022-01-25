package Edabit;

public class CrowdedCarriageCapacity {
    public static void main(String[] args) {
        int res;

        res = findSeat(200, new int[] { 35, 23, 18, 10, 40 });
        System.out.println(res);

        res = findSeat(20, new int[] { 3, 5, 4, 2 });
        System.out.println(res);

        res = findSeat(1000, new int[] { 50, 20, 80, 90, 100, 60, 30, 50, 80, 60 });
        System.out.println(res);

        res = findSeat(200, new int[] { 35, 23, 40, 21, 38 });
        System.out.println(res);

        res = findSeat(21, new int[] { 6, 3, 7 });
        System.out.println(res);

        res = findSeat(544, new int[] { 26, 27, 25, 30, 12, 17, 22, 32, 19, 21, 18, 16, 15, 29, 28, 31, 20 });
        System.out.println(res);

        res = findSeat(20, new int[] { 3, 5, 4, 2 });
        System.out.println(res);

        res = findSeat(1000, new int[] { 60, 70, 80, 90, 100, 20, 30, 50, 80, 60 });
        System.out.println(res);

        res = findSeat(1000, new int[] { 70, 60, 80, 90, 10, 60, 30, 50, 80, 60 });
        System.out.println(res);

        res = findSeat(200, new int[] { 35, 23, 18, 10, 40 });
        System.out.println(res);

        res = findSeat(11037, new int[] { 1839, 0, 0 });
        System.out.println(res);

        res = findSeat(200, new int[] { 35, 23, 40, 21, 38 });
        System.out.println(res);
    }

    public static int findSeat(int n, int[] arr) {
        int nCarriage = arr.length;
        int maxCarriageCap = n / nCarriage;
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0.5 * maxCarriageCap) {
                res = i;
                break;
            }
        }

        return res;
    }
}
