package PrakPemdas.HR3;

import java.util.Scanner;

public class informasiAkademik2 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        double tugas, kuis, uts, uas, keaktifan, nilaiakhir;
        tugas = io.nextDouble();
        kuis = io.nextDouble();
        uts = io.nextDouble();
        uas = io.nextDouble();
        keaktifan = io.nextDouble();
        io.close();

        nilaiakhir = 0.1 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas + 0.1 * keaktifan;

        if (nilaiakhir > 80 && nilaiakhir <= 100) {
            System.out.println("Huruf Mutu : A");
            System.out.println("Angka Mutu : 4.0");
            System.out.println("Predikat : Sangat Baik");
        } else if (nilaiakhir > 75 && nilaiakhir <= 80) {
            System.out.println("Huruf Mutu : B+");
            System.out.println("Angka Mutu : 3.5");
            System.out.println("Predikat : Lebih Baik");
        } else if (nilaiakhir > 69 && nilaiakhir <= 75) {
            System.out.println("Huruf Mutu : B");
            System.out.println("Angka Mutu : 3.0");
            System.out.println("Predikat : Baik");
        } else if (nilaiakhir > 60 && nilaiakhir <= 69) {
            System.out.println("Huruf Mutu : C+");
            System.out.println("Angka Mutu : 2.5");
            System.out.println("Predikat : Lebih dari Cukup");
        } else if (nilaiakhir > 55 && nilaiakhir <= 60) {
            System.out.println("Huruf Mutu : C");
            System.out.println("Angka Mutu : 2.0");
            System.out.println("Predikat : Cukup");
        } else if (nilaiakhir > 50 && nilaiakhir <= 55) {
            System.out.println("Huruf Mutu : D+");
            System.out.println("Angka Mutu : 1.5");
            System.out.println("Predikat : Lebih dari Kurang");
        } else if (nilaiakhir > 44 && nilaiakhir <= 50) {
            System.out.println("Huruf Mutu : D");
            System.out.println("Angka Mutu : 1.0");
            System.out.println("Predikat : Kurang");
        } else {
            System.out.println("Huruf Mutu : E");
            System.out.println("Angka Mutu : 0.0");
            System.out.println("Predikat : Gagal");
        }
    }
}