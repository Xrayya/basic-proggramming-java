package Codeforces;

import java.util.Scanner;

public class BrainsPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String res = "#Black&White";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = sc.next().charAt(0);

                if (c == 'C' || c == 'M' || c == 'Y') {
                    res = "#Color";
                }
            }
        }

        System.out.println(res);
        sc.close();
    }
}
