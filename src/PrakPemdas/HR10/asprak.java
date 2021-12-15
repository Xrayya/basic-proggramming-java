package PrakPemdas.HR10;

import java.util.Scanner;

public class asprak {

    static String[] nama;
    static float[][] nilai;
    static float[] rerata;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        kalkulasi();
        cetak();
    }

    static void input() {
        int nMhs, nMK;

        nMhs = in.nextInt();
        nMK = in.nextInt();
        in.nextLine();

        nama = new String[nMhs];
        nilai = new float[nMhs][nMK];
        rerata = new float[nMhs];

        for (int i = 0; i < nMhs; i++) {
            nama[i] = in.next();
            for (int j = 0; j < nMK; j++) {
                nilai[i][j] = in.nextFloat();
            }
        }
    }

    static void kalkulasi() {
        for (int i = 0; i < nama.length; i++) {
            rerata[i] = mean(nilai[i]);
        }
    }

    static void cetak() {
        int rerataTertinggi;
        for (int i = 0; i < nama.length; i++) {
            System.out.printf(
                "Rata-rata nilai mahasiswa %s adalah %.2f\n",
                nama[i],
                rerata[i]
            );
        }

        System.out.printf("Rata-rata kelas: %.2f\n", mean(rerata));

        rerataTertinggi = indeksRerataTertinggi(rerata);
        System.out.printf(
            "Mahasiswa yang memiliki nilai tertinggi adalah %s dengan nilai %.2f",
            nama[rerataTertinggi],
            rerata[rerataTertinggi]
        );
    }

    static float mean(float[] nilai) {
        float rerata = 0;
        for (float i : nilai) {
            rerata += i;
        }
        rerata /= nilai.length;
        return rerata;
    }

    static int indeksRerataTertinggi(float[] nilai) {
        int indeks = 0;
        for (int i = 1; i < nilai.length; i++) {
            if (nilai.length > 1) {
                if (nilai[i] > nilai[i - 1]) {
                    indeks = i;
                }
            } else {
                break;
            }
        }
        return indeks;
    }
}
