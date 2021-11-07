package Pemdas.tgl25;

import java.util.Scanner;

public class v3 {
    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v3.0
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bilA, bilB, bil1, bil2;

        System.out.println("****************\n" + "Main BIlangan v3.0\n" + "****************\n");

        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = in.nextInt();
        in.close();

        System.out.println("\nKonfigurasi bilangan:");
        bilA = bil1;
        bilB = bil2;
        if (bil1 < bil2)
            while (bilA <= bil2) {
                System.out.println(bilA + " " + bilB);
                bilA++;
                bilB--;
            }
        // for (int i = bil1, j = bil2; i <= bil2; i++, j--) {
        // System.out.println(i + " " + j);
        // }
        else
            while (bilA >= bil2) {
                System.out.println(bilA + " " + bilB);
                bilA--;
                bilB++;
            }
        // for (int i = bil1, j = bil2; i >= bil2; i--, j++) {
        // System.out.println(i + " " + j);
        // }

        System.out.print("\nTerima kasih, anda telah bermain dengan bilangan " + bil1 + " dan " + bil2 + ".");
    }
}