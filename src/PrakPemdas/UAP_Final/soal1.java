package PrakPemdas.UAP_Final;

import java.util.Scanner;

public class soal1 {

    static final int MAX_LAMAN = 50;
    static int totalLaman, aktif, range, awal, akhir, komplemenAwal, komplemenAkhir;
    static String[] hasil;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        // proses();
        // cetak();

        if (aktif - range > 1) {
            System.out.print("Prev ");
        }
        for (int i = aktif - range / 2; i <= aktif + range / 2; i++) {
            System.out.print(i + " ");
        }
        if (aktif + range / 2 < totalLaman && aktif + range / 2 < MAX_LAMAN) {
            System.out.print("Next");
        }
    }

    static void input() {
        totalLaman = in.nextInt();
        aktif = in.nextInt();
        range = in.nextInt();
    }

    static void proses() {
        if (aktif - range / 2 < 1) {
            awal = 1;
            komplemenAwal = 0;
            komplemenAkhir = Math.abs(aktif - range / 2) + 1;
        } else {
            awal = aktif - range / 2;
            komplemenAkhir = 0;
        }
        if (aktif + range / 2 > totalLaman) {
            if (aktif + range / 2 > MAX_LAMAN) {
                akhir = MAX_LAMAN;
                komplemenAkhir = 0;
                komplemenAwal = akhir - aktif;
            } else {
                akhir = totalLaman;
                komplemenAwal = 0;
                komplemenAwal = akhir - aktif;
            }
        } else {
            akhir = aktif + range / 2;
            komplemenAwal = 0;
        }
    }

    static void cetak() {
        int batasAwal, batasAkhir;

        if (awal - komplemenAwal < 1) {
            batasAwal = 1;
        } else {
            batasAwal = awal - komplemenAwal;
        }

        if (akhir + komplemenAkhir > totalLaman) {
            if (akhir + komplemenAkhir > MAX_LAMAN) {
                batasAkhir = MAX_LAMAN;
            } else {
                batasAkhir = totalLaman;
            }
        } else {
            batasAkhir = akhir + komplemenAkhir;
        }

        if (batasAwal > 1) {
            System.out.print("Prev ");
        }

        for (int i = batasAwal; i <= batasAkhir; i++) {
            System.out.print(i + " ");
        }

        if (batasAkhir < totalLaman || batasAkhir < MAX_LAMAN) {
            System.out.print("Next");
        }
    }
}
