package Edabit;

public class SevenBoom {
    public static void main(String[] args) {
        String res = "";
        res = checkSeven(new int[] { 2, 6, 7, 9, 3 });
        System.out.println(res);

        res = checkSeven(new int[] { 33, 68, 400, 5 });
        System.out.println(res);

        res = checkSeven(new int[] { 86, 48, 100, 66 });
        System.out.println(res);

        res = checkSeven(new int[] { 76, 55, 44, 32 });
        System.out.println(res);

        res = checkSeven(new int[] { 35, 4, 9, 37 });
        System.out.println(res);
    }

    public static String checkSeven(int[] arr) {
        for (int num : arr) {
            while (num != 0) {
                if (num % 10 == 7) {
                    return "Boom!";
                } else {
                    num /= 10;
                }
            }
        }

        return "There is no 7 in the array";
    }
}
