package Codeforces;

import java.util.Scanner;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String k = sc.next();
            String s = sc.next();

            int ans = 0;
            int currIdx = 0;
            int previdx = 0;
            for (int j = 1; j < s.length(); j++) {
                currIdx = k.indexOf(s.charAt(j)) + 1;
                previdx = k.indexOf(s.charAt(j - 1)) + 1;
                ans += Math.abs(currIdx - previdx);
                System.out.print("");
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
