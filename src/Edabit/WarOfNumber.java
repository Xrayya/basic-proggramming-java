package Edabit;

public class WarOfNumber {
    public static void main(String[] args) {
        int res;

        res = warOfNumbers(new int[] { 2, 8, 7, 5 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 12, 90, 75 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 654, 7, 23, 3, 78, 4, 56, 34 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 97, 83, 209, 141, 134, 298, 110, 207, 229, 275, 115, 64, 244, 278 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 332, 92, 35, 315, 109, 168, 320, 230, 63, 323, 16, 204, 105, 17, 226, 157, 245,
                44, 223, 136, 93 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 322, 89, 36, 310, 297, 157, 251, 55, 264, 244, 200, 304, 25, 308, 311, 269, 303,
                257, 6, 311, 307, 310, 50, 46, 54, 237, 59, 105, 267 });
        System.out.println(res);

        res = warOfNumbers(new int[] { 50, 100, 149, 1, 200, 199, 3, 2 });
        System.out.println(res);
    }

    public static int warOfNumbers(int[] numbers) {
        int odd = 0, even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i];
            } else {
                odd += numbers[i];
            }
        }

        return Math.abs(odd - even);
    }
}
