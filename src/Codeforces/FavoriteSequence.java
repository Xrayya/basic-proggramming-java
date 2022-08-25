package Codeforces;

import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] b = new int[n];
            String res = "";
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println(b[0]);
                continue;
            }
            for (int j = 0; j <= n / 2 - 1; j++) {
                res += String.format("%d %d ", b[j], b[n - j - 1]);
                if (j == n / 2 - 1 && n % 2 == 1) {
                    res += b[j + 1];
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }

    // another solution -> simpler
    public static void solve(int[] b) {
        int left = 0, right = b.length - 1;
        int[] res = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 0) {
                res[i] = b[left++];
            } else {
                res[i] = b[right--];
            }
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
