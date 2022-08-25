package Codeforces;

import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();

            if (s.charAt(0) != 'y' && s.charAt(0) != 'Y') {
                System.out.println("NO");
                continue;
            } else if (s.charAt(1) != 'e' && s.charAt(1) != 'E') {
                System.out.println("NO");
                continue;
            } else if (s.charAt(2) != 's' && s.charAt(2) != 'S') {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
        sc.close();
    }
}
