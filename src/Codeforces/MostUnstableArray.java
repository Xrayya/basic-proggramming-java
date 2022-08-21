package Codeforces;

import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(Math.min(2, n - 1) * m);
        }
        sc.close();
    }
}
