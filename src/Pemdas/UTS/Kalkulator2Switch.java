package Pemdas.UTS;

import java.util.Scanner;

public class Kalkulator2Switch {
    public static void main(String[] args) {

        // ===========================
        // Kalkulator v2.a
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        double bil1, bil2;
        int operasi;

        System.out.println("*************");
        System.out.println("Kalkulator v2.b");
        System.out.println("*************\n");

        System.out.println(
                "Menu operasi:\n" + "1. Penjumlahan\n" + "2. Pengurangan\n" + "3. Perkalian\n" + "4. Pembagian\n");

        System.out.printf("Pilih operasi: ");
        operasi = in.nextInt();

        switch (operasi) {
            case 1:
                System.out.println("\nPenjumlahan");
                break;
            case 2:
                System.out.println("\nPengurangan");
                break;
            case 3:
                System.out.println("\nPerkalian");
                break;
            case 4:
                System.out.println("\nPembagian");
                break;
        }

        System.out.print("Angka pertama: ");
        bil1 = in.nextDouble();
        System.out.print("Angka kedua: ");
        bil2 = in.nextDouble();
        in.close();

        System.out.print("\nHasil operasi: ");
        switch (operasi) {
            case 1:
                System.out.println(bil1 + bil2);
                break;
            case 2:
                System.out.println(bil1 - bil2);
                break;
            case 3:
                System.out.println(bil1 * bil2);
                break;
            case 4:
                System.out.println(bil1 / bil2);
                break;
        }
    }
}