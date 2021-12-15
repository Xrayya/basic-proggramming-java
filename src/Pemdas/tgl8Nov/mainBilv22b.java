package Pemdas.tgl8Nov;

import java.util.Scanner;

public class mainBilv22b {

    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v2.2.b
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bil1, bil2, bilFavorit, bilTerlarang;

        System.out.println("******************");
        System.out.println("Main Bilangan v2.2.a");
        System.out.println("******************\n");

        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = in.nextInt();
        System.out.print("Masukkan bilangan bulat favorit: ");
        bilFavorit = in.nextInt();
        System.out.print("Masukkan bilangan bulat terlarang: ");
        bilTerlarang = in.nextInt();

        System.out.println("\nKonfigurasi bilangan:");
        if (bil1 < bil2) {
            for (int i = bil1; i <= bil2; i++) {
                if (i != bilTerlarang) {
                    System.out.print(i);
                    if (i == bilFavorit) {
                        if (bilFavorit % 2 == 0) {
                            System.out.println(
                                " – bilangan favorit adalah bilangan genap"
                            );
                        } else {
                            System.out.println(
                                " – bilangan favorit adalah bilangan ganjil"
                            );
                        }
                    } else {
                        System.out.println();
                    }
                }
            }
        } else {
            for (int i = bil1; i >= bil2; i--) {
                if (i != bilTerlarang) {
                    System.out.print(i);
                    if (i == bilFavorit) {
                        if (bilFavorit % 2 == 0) {
                            System.out.println(
                                " – bilangan favorit adalah bilangan genap"
                            );
                        } else {
                            System.out.println(
                                " – bilangan favorit adalah bilangan ganjil"
                            );
                        }
                    } else {
                        System.out.println();
                    }
                }
            }
        }

        System.out.printf(
            "\nTerima kasih, anda telah bermain dengan bilangan %d, %d, %d, dan %d.",
            bil1,
            bil2,
            bilFavorit,
            bilTerlarang
        );
        in.close();
    }
}
