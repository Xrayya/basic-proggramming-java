package Edabit;

public class PhytagoreanTriplet {
    public static void main(String[] args) {
        boolean res;

        res = isTriplet(3, 4, 5);
        System.out.println(res);

        res = isTriplet(13, 5, 12);
        System.out.println(res);

        res = isTriplet(1, 2, 3);
        System.out.println(res);

        res = isTriplet(72, 54, 90);
        System.out.println(res);

        res = isTriplet(54, 46, 77);
        System.out.println(res);

        res = isTriplet(80, 48, 64);
        System.out.println(res);

        res = isTriplet(3, 18, 8);
        System.out.println(res);

        res = isTriplet(7, 12, 7);
        System.out.println(res);

        res = isTriplet(13, 5, 12);
        System.out.println(res);

        res = isTriplet(12, 20, 18);
        System.out.println(res);

        res = isTriplet(17, 14, 2);
        System.out.println(res);

        res = isTriplet(6, 15, 12);
        System.out.println(res);

        res = isTriplet(60, 61, 11);
        System.out.println(res);

        res = isTriplet(7, 13, 15);
        System.out.println(res);

        res = isTriplet(12, 18, 7);
        System.out.println(res);

        res = isTriplet(8, 17, 15);
        System.out.println(res);

        res = isTriplet(3120, 79, 3121);
        System.out.println(res);

        res = isTriplet(72, 54, 90);
        System.out.println(res);

        res = isTriplet(80, 48, 64);
        System.out.println(res);
    }

    public static boolean isTriplet(int a, int b, int c) {
        int shortest = Math.min(a, Math.min(b, c));
        int biggest = Math.max(a, Math.max(b, c));
        int mid = a > shortest && a < biggest ? a : b > shortest && b < biggest ? b : c;

        System.out.printf("%d %d %d\n", shortest, mid, biggest);

        return shortest * shortest + mid * mid == biggest * biggest ? true : false;
    }
}
