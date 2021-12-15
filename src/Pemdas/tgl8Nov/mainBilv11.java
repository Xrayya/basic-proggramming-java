package Pemdas.tgl8Nov;

import java.util.Scanner;

public class mainBilv11 {

    public static void main(String[] args) {
        // ===========================
        // Main Bilangan v1.1
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        int bil, jumlah, banyakData, terbesar, terkecil;
        char lagi;
        bil = 0;
        jumlah = 0;
        banyakData = 0;
        terbesar = -2147483648;
        terkecil = 2147483647;

        System.out.println("****************");
        System.out.println("Main Bilangan v1.1");
        System.out.println("****************");

        do {
            System.out.print("\nMasukkan sebuah bilangan bulat: ");
            bil = in.nextInt();
            System.out.println("Ingin bermain lagi?");
            System.out.print(
                "(masukkan huruf ‘y’ (tanpa tanda kutip) jika setuju, atau huruf lainnya jika tidak setuju): "
            );
            lagi = in.next().charAt(0);

            jumlah += bil;
            banyakData++;
            if (bil > terbesar) {
                terbesar = bil;
            }
            if (bil < terkecil) {
                terkecil = bil;
            }
        } while (lagi == 'y');

        System.out.println("\nJumlah nilai seluruh bilangan: " + jumlah);
        System.out.println(
            "Nilai rata-rata dari seluruh bilangan: " + (jumlah / banyakData)
        );
        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terkecil: " + terkecil);
        in.close();
    }
}
