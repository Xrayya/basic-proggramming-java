package Edabit;

public class SameNumOfUniqueChar {
    public static void main(String[] args) {
        boolean res;

        res = same(new int[] { 1, 3, 4, 4, 4 }, new int[] { 2, 5, 7 });
        System.out.println(res);

        res = same(new int[] { 9, 8, 7, 6 }, new int[] { 4, 4, 3, 1 });
        System.out.println(res);

        res = same(new int[] { 2 }, new int[] { 3, 3, 3, 3, 3 });
        System.out.println(res);

        res = same(new int[] { 5, 6, 7, 9 }, new int[] { 4, 1 });
        System.out.println(res);

        res = same(new int[] { 5, 9, 9 }, new int[] { 9, 5 });
        System.out.println(res);

        res = same(new int[] { 1, 1, 1, 4 }, new int[] { 1, 4, 4, 4, 4, 4 });
        System.out.println(res);

        res = same(new int[] {}, new int[] {});
        System.out.println(res);
    }

    public static boolean same(int[] a1, int[] a2) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < a1.length; i++) {

            int j;
            for (j = 0; j < a2.length; j++) {
                if (a1[i] == a1[j]) {
                    break;
                }
            }

            if (i == j) {
                countA++;
            }
        }

        for (int i = 0; i < a2.length; i++) {

            int j;
            for (j = 0; j < a2.length; j++) {
                if (a2[i] == a2[j]) {
                    break;
                }
            }

            if (i == j) {
                countB++;
            }
        }

        return countA == countB ? true : false;
    }
}
