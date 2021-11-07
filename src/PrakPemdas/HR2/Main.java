package PrakPemdas.HR2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        ///////////// bola ajaib
        int n, tinggi;

        n = io.nextInt();

        tinggi = n * n - 2 * n + 11;
        // tinggi = 10 + (int) Math.pow(n - 1, 2);

        System.out.println(tinggi);

        //// opsi 2

        // int n, tinggi;

        // n = io.nextInt();

        // tinggi = 10;
        // for (int i = 1; i < n; i++) {
        // tinggi += 2 * i - 1;
        // }

        // System.out.println(tinggi);

        ////////////// biaya 2
        // double x1, y1, x2, y2, jarak, biaya;

        // x1 = io.nextDouble();
        // y1 = io.nextDouble();
        // x2 = io.nextDouble();
        // y2 = io.nextDouble();

        // jarak = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        // biaya = jarak * 2000;

        // System.out.printf("Biaya ojol dari titik (%.2f,%.2f) ke titik (%.2f,%.2f)
        // adalah = Rp%.2f", x1, y1, x2, y2,
        // biaya);

        io.close();
    }
}