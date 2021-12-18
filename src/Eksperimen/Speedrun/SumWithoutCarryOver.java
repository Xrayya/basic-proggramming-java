package Eksperimen.Speedrun;

import java.util.Scanner;

public class SumWithoutCarryOver {
    static Scanner in = new Scanner(System.in);

    public static int[] result() {
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        int[] res = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int factor = 1;
            while (arr[i][0] > 0 || arr[i][1] > 0) {
                res[i] += (arr[i][0] % 10 + arr[i][1] % 10) % 10 * factor;

                arr[i][0] /= 10;
                arr[i][1] /= 10;
                factor *= 10;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] r = result();
        for (int i = 0; i < r.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + r[i]);
        }
    }
}
