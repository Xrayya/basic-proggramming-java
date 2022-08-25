package Codeforces;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Division ");
            int r = sc.nextInt();

            if (r <= 1399) {
                System.out.println("4");
            } else if (r <= 1599) {
                System.out.println("3");
            } else if (r <= 1899) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
        sc.close();
    }
}
