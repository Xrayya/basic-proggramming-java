package Codeforces;

import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int cnt1 = 0, cnt2 = 0;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    cnt1++;
                } else if (a == 2) {
                    cnt2++;
                }
            }

            if (cnt1 % 2 == 1) {
                System.out.println("NO");
            } else if (cnt2 % 2 == 1 && cnt1 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
