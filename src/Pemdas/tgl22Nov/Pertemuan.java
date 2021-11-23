package Pemdas.tgl22Nov;

import java.util.Scanner;

public class Pertemuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double luas;

        System.out.println(223455);

        luas = 3.14 * 10 * 10;
        System.out.println(luas);
        luas = luasLingkaran(10);
        System.out.println(luas);
        in.close();
    }

    public static void cetak(int val) {
        System.out.println(val);
    }

    public static double luasLingkaran(double radius) {
        return 3.14 * radius * radius;
    }
}

// Class adalah objek
// objek berisi method
// pada OOP, setiap objek saling bekerja sama dalam memecahkan suatu masalah
// di mana suatu jenis masalah biasanya dikerjakan oleh objek tertentu
// dan setiap objek memiliki method yang memiliki "kemampuan" khusus pada masalah tertentu
