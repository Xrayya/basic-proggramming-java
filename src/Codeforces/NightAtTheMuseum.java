package Codeforces;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        sc.close();

        solve(input);
    }

    public static void solve(String input) {
        int ans = 0;
        char lastChar = 'a';
        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            // not optimal
            // int calc1 = Math.abs(currChar - lastChar);
            // int calc2 = Math.abs(Math.min(lastChar, currChar) + 26 - Math.max(lastChar,
            // currChar));
            int calc = Math.abs(currChar - lastChar);
            ans += Math.min(calc, 26 - calc);
            lastChar = currChar;
        }
        System.out.println(ans);
    }
}
