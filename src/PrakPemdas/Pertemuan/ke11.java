// Note //
// ada Method by Reference
// ada Method by Value

package PrakPemdas.Pertemuan;

import java.util.Scanner;

public class ke11 {

    static int a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = lowercase("Azhary Munir Abdillah");

        int bil = testPembulatan(5.2, 10);

        System.out.println(nama);
        System.out.println(bil);
        in.close();
    }

    static String lowercase(String s) {
        return s.toLowerCase();
    }

    static int testPembulatan(double a, int b) {
        return 10 + b + (int) Math.round(a);
    }
}
