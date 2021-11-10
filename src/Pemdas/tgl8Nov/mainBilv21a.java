package Pemdas.tgl8Nov;

import java.util.Scanner;

public class mainBilv21a {
    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v1.1
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bil1, bil2, bilFavorit, i;

        System.out.println("******************");
        System.out.println("Main Bilangan v2.1.a");
        System.out.println("******************\n");

        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = in.nextInt();
        System.out.print("Masukkan bilangan bulat favorit: ");
        bilFavorit = in.nextInt();

        System.out.println("\nKonfigurasi bilangan:");
        i = bil1;
        if (bil1 < bil2) {
            while (i <= bil2) {
                System.out.print(i);
                if (i == bilFavorit) {
                    if (bilFavorit % 2 == 0) {
                        System.out.println(" – bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(" – bilangan favorit adalah bilangan ganjil");
                    }
                } else {
                    System.out.println();
                }
                i++;
            }
        } else {
            while (i >= bil2) {
                System.out.print(i);
                if (i == bilFavorit) {
                    if (bilFavorit % 2 == 0) {
                        System.out.println(" – bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(" – bilangan favorit adalah bilangan ganjil");
                    }
                } else {
                    System.out.println();
                }
                i--;
            }
        }

        System.out.printf("\nTerima kasih, anda telah bermain dengan bilangan %d, %d, dan %d.", bil1, bil2, bilFavorit);
        in.close();
    }
}
