package PrakPemdas.HR5;

import java.util.Scanner;

public class squidward {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int order, jumlah, biaya, uang;
        biaya = 0;
        jumlah = 0;

        System.out.println("SELAMAT DATANG DI KRUSTY KRAB");
        System.out.println("LIST MAKANAN:");
        System.out.println("1. Buger 10.000");
        System.out.println("2. Cheese Burger 13.000");
        System.out.println("3. Burger Jumbo 20.000");
        System.out.println("4. Kentang Goreng 7.000");
        System.out.println("0. Keluar");

        do {
            System.out.println("Pilih order dan masukkan jumlah: ");
            order = in.nextInt();
            if (order >= 1 && order <= 4)
                jumlah = in.nextInt();

            switch (order) {
                case 1:
                    biaya += 10000 * jumlah;
                    break;
                case 2:
                    biaya += 13000 * jumlah;
                    break;
                case 3:
                    biaya += 20000 * jumlah;
                    break;
                case 4:
                    biaya += 7000 * jumlah;
                    break;
                default:
                    if (order != 0) {
                        in.nextLine();
                        System.out.println("Pilihan tidak ada");
                    }
            }
        } while (order != 0);

        System.out.println("LIST MINUMAN:");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Teh Lemon 7.000");
        System.out.println("3. Soda 7.500");
        System.out.println("0. Keluar");

        do {
            System.out.println("Pilih order dan masukkan jumlah: ");
            order = in.nextInt();
            if (order >= 1 && order <= 3)
                jumlah = in.nextInt();

            switch (order) {
                case 1:
                    biaya += 5000 * jumlah;
                    break;
                case 2:
                    biaya += 7000 * jumlah;
                    break;
                case 3:
                    biaya += 7500 * jumlah;
                    break;
                default:
                    if (order != 0) {
                        in.nextLine();
                        System.out.println("Pilihan tidak ada");
                    }
            }
        } while (order != 0);
        System.out.println("Total belanja: " + biaya);

        System.out.println("Masukkan uang untuk membayar: ");
        uang = in.nextInt();
        while (uang < biaya) {
            System.out.println("Uang yang dimasukkan kurang " + (biaya - uang) + ". Masukkan uang lagi: ");
            uang += in.nextInt();
        }
        in.close();

        if (uang != biaya)
            System.out.println("Kembalian: " + (uang - biaya));
        System.out.println("Terima kasih sudah belanja di Krusty Krab!");
    }
}