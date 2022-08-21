package Codeforces;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int fist = sc.nextInt();
            int cnt = 0;
            for (int j = 0; j < 3; j++) {
                int next = sc.nextInt();
                cnt += next > fist ? 1 : 0;
            }
            
            System.out.println(cnt);
        }
        sc.close();
    }
}
