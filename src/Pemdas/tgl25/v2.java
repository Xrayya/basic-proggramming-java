package Pemdas.tgl25;

import java.util.Scanner;

public class v2 {
    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v2.0
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bil, bil1, bil2;

        System.out.println("****************\n" + "Main Bilangan v2.0\n" + "****************\n");

        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = in.nextInt();
        in.close();

        System.out.println("\nKonfigurasi bilangan:");
        bil = bil1;
        if (bil1 < bil2)
            while (bil <= bil2) {
                System.out.println(bil);
                bil++;
            }
        else
            while (bil >= bil2) {
                System.out.println(bil);
                bil--;
            }

        System.out.print("\nTerima kasih, anda telah bermain dengan bilangan " + bil1 + " dan " + bil2 + ".");
    }
}