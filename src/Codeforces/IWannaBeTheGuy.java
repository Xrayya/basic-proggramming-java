package Codeforces;

import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] lvls = new boolean[sc.nextInt()];

        int nx = sc.nextInt();
        for (int i = 0; i < nx; i++) {
            lvls[sc.nextInt() - 1] = true;
        }

        int ny = sc.nextInt();
        for (int i = 0; i < ny; i++) {
            lvls[sc.nextInt() - 1] = true;
        }

        boolean res = true;
        for (boolean lvl : lvls) {
            res = res && lvl;
        }

        if (res) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
