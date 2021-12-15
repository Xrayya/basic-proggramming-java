package PrakPemdas.UAP_Final;

import java.util.Scanner;

public class pertama {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalLaman, aktif, range, komplemenAwal, komplemenAkhir, awal, akhir;

        totalLaman = in.nextInt();
        aktif = in.nextInt();
        range = in.nextInt();

        int[] hasil = new int[range + 1];

        komplemenAwal = 0;
        komplemenAkhir = 0;

        if (aktif - range / 2 < 0) {
            komplemenAkhir += Math.abs(aktif - range / 2) + 1;
        }

        if (aktif + range / 2 > totalLaman) {
            komplemenAwal += range / 2;
        }

        if (aktif - range / 2 < 1) {
            // hasil[0] = 1;
            awal = 1;
        } else {
            // hasil[0] = aktif - range / 2;
            awal = aktif - range / 2;
        }

        if (aktif + range / 2 > totalLaman) {
            // hasil[range + 1] = totalLaman;
            akhir = totalLaman;
        } else {
            // hasil[range + 1] = aktif + range / 2;
            akhir = aktif + range / 2;
        }

        if (awal - komplemenAwal < 1) {
            awal = 1;
        } else {
            awal -= komplemenAwal;
        }

        if (akhir + komplemenAkhir > totalLaman) {
            akhir = totalLaman;
        } else {
            akhir += komplemenAkhir;
        }

        if (aktif != awal) {
            System.out.print("Prev ");
        }
        for (int i = awal; i <= akhir; i++) {
            System.out.print(i + " ");
        }
        if (aktif != akhir) {
            System.out.print("Next");
        }
    }
}
