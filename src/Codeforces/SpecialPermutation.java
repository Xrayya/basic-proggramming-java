package Codeforces;

import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            // less effective
            // for (int j = 1; j <= n; j+=2) {
            //     if (j == n - 2) {
            //         System.out.printf("%d %d %d", j + 2, j, j + 1);
            //         break;
            //     }

            //     System.out.printf("%d %d ", j + 1, j);
            // }

            for (int j = 2; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println("1");
        }
        sc.close();
    }
}
