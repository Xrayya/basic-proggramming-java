package PrakPemdas.Pertemuan;

import java.util.Scanner;

public class ke12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        long input = in.nextLong();
        System.out.println(jumlahSemuaDigit(input));
    }

    static long jumlahSemuaDigit(long input) {
        long jumlah = 0;

        if (input < 10 && input != 0) {
            return jumlah;
        } else {
            while (input > 0) {
                jumlah += input % 10;
                input /= 10;
            }
            return jumlahSemuaDigit(jumlah);
        }

    }
}

// TODO: coba buat kode:
// - method yg menjumlahkan semua digit
// - program yg menampilkan hasil dari perkalian n angka prima pertama
// - fungsi rekursif
// - sort (bubble sort)
// - menambahkan 1 elemen dalam array yang sudah penuh
