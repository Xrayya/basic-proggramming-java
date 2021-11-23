package Pemdas.tgl15Nov;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        // ===========================
        // Semua Tak Tentu Sama v1.0
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int banyakBilangan;
        String nilai[];

        System.out.println("*********************");
        System.out.println("Semua Tak Tentu Sama");
        System.out.println("v1.0");
        System.out.println("*********************");

        System.out.print("\nBerapa banyaknya bilangan dalam daftar bilangan?  ");
        banyakBilangan = in.nextInt();
        nilai = new String[banyakBilangan];

        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("  Masukkan bilangan ke-%d: ", i + 1);
            nilai[i] = in.next();
        }

        System.out.print("\nDaftar bilangan:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("\n  Bilangan ke-" + (i + 1) + ": " + nilai[i]);
        }
        in.close();
    }
}
