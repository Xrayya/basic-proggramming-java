package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);
            int curr = a[0];
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (a[j] == curr) {
                    if (++cnt == 3) {
                        System.out.println(a[j]);
                        break;
                    }
                } else {
                    curr = a[j];
                    cnt = 1;
                }
            }
            System.out.println(-1);
        }
    }
}
