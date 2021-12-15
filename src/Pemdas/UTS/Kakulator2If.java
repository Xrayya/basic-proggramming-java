package Pemdas.UTS;

import java.util.Scanner;

public class Kakulator2If {

    public static void main(String[] args) {
        // ===========================
        // Kalkulator v2.a
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        double bil1, bil2;
        int operasi;

        System.out.println("*************");
        System.out.println("Kalkulator v2.a");
        System.out.println("*************\n");

        System.out.println(
            "Menu operasi:\n" +
            "1. Penjumlahan\n" +
            "2. Pengurangan\n" +
            "3. Perkalian\n" +
            "4. Pembagian\n"
        );

        System.out.printf("Pilih operasi: ");
        operasi = in.nextInt();

        if (operasi == 1) {
            System.out.println("\nPenjumlahan");
        } else if (operasi == 2) {
            System.out.println("\nPengurangan");
        } else if (operasi == 3) {
            System.out.println("\nPerkalian");
        } else if (operasi == 4) {
            System.out.println("\nPembagian");
        }

        System.out.print("Angka pertama: ");
        bil1 = in.nextDouble();
        System.out.print("Angka kedua: ");
        bil2 = in.nextDouble();
        in.close();

        System.out.print("\nHasil operasi: ");
        if (operasi == 1) {
            System.out.print(bil1 + bil2);
        } else if (operasi == 2) {
            System.out.print(bil1 - bil2);
        } else if (operasi == 3) {
            System.out.print(bil1 * bil2);
        } else if (operasi == 4) {
            System.out.print(bil1 / bil2);
        }
    }
}
