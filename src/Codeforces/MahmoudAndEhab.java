package Codeforces;

import java.util.Scanner;

public class MahmoudAndEhab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println(n % 2 == 1 ? "Ehab" : "Mahmoud");
    }
}
