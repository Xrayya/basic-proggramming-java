package Codeforces;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int cnt = 0;
        int ith = 0;
        for (int i = 1;; i++) {
            ith += i;
            cnt += ith;

            if (cnt > n) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
