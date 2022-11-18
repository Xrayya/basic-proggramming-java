package Codeforces;

import java.util.Scanner;

public class VusContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte m = sc.nextByte();
        byte k = sc.nextByte();
        sc.close();

        if (m >= n && k >= n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
