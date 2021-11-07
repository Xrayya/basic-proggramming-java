package PrakPemdas.HR5;

import java.util.Scanner;

public class investasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double modal, tahun, persen, keuntungan, hasil;
        int nPilihan, urutan;
        urutan = 0;
        hasil = 0;

        nPilihan = in.nextInt();
        for (int i = 0; i < nPilihan; i++) {
            modal = in.nextDouble();
            tahun = in.nextDouble();
            persen = in.nextDouble();

            keuntungan = modal * Math.pow(1 + persen * 0.01, tahun) - modal;

            if (keuntungan > hasil) {
                hasil = keuntungan;
                urutan = i + 1;
            }
        }
        in.close();

        System.out.printf("%d = %.2f", urutan, hasil);
    }
}