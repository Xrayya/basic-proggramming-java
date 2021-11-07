package Pemdas.tgl25;

import java.util.Scanner;

public class v1 {
    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v1.0
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bil, pengulangan;

        System.out.println("****************\n" + "Main Bilangan v1.0\n" + "****************\n");

        System.out.print("Masukkan sebuah bilangan bulat: ");
        bil = in.nextInt();
        System.out.print("Berapa kali bilangan ingin dicetak? ");
        pengulangan = in.nextInt();
        in.close();

        System.out.println("Hasil:");
        while (pengulangan > 0) {
            System.out.println(bil);
            pengulangan--;
        }
    }
}