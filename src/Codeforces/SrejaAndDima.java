package Codeforces;

import java.util.Scanner;

public class SrejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        sc.close();

        int s = 0, d = 0;
        int i = 0, j = n - 1;
        while (i <= j) {
            if (cards[i] >= cards[j]) {
                s += cards[i];
                i++;
            } else {
                s += cards[j];
                j--;
            }

            if (i > j) {
                break;
            }

            if (cards[i] >= cards[j]) {
                d += cards[i];
                i++;
            } else {
                d += cards[j];
                j--;
            }
        }

        System.out.println(s + " " + d);
    }
}
