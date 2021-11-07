package PrakPemdas.HR4;

import java.util.Scanner;

public class ayam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float jarak, waktu, kecepatan;
        jarak = in.nextFloat();
        waktu = in.nextFloat();
        in.close();

        kecepatan = jarak * 0.001f / (waktu / 3600);

        System.out.println(jarak / 1000);

        System.out.printf("%02d:", (int) (waktu / 3600));
        waktu %= 3600;
        System.out.printf("%02d:", (int) (waktu / 60));
        waktu %= 60;
        System.out.printf("%02d\n", (int) waktu);

        System.out.printf("%.2f", kecepatan);
    }
}