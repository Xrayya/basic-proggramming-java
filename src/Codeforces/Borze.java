package Codeforces;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bc = sc.next();
        sc.close();

        String res = "";
        for (int i = 0; i < bc.length(); i++) {
            if (bc.charAt(i) == '.') {
                res += "0";
            } else {
                if (bc.charAt(i + 1) == '.') {
                    res += "1";
                } else {
                    res += "2";
                }
                i++;
            }
        }

        System.out.println(res);
    }
}
