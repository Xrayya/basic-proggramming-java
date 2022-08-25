package Codeforces;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int currMax = 1;
        int ans = 1;
        for (int i = 0; i + 1 < n; i++) {
            if (arr[i] < arr[i + 1]) {
                currMax++;
            } else {
                ans = Math.max(currMax, ans);
                currMax = 1;
            }
        }

        System.out.println(Math.max(ans, currMax));
    }
}
