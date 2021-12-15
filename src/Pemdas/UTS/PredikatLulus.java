package Pemdas.UTS;

import java.util.Scanner;

public class PredikatLulus {

    public static void main(String[] args) {
        // ============================
        // Cek Predikat Kelulusan v1.0
        // Oleh Azhary Munir Abdillah
        // ============================

        Scanner in = new Scanner(System.in);

        double ipk, masaStudi;
        char matkulDiBawahB;

        System.out.println("***********************");
        System.out.println("Cek Predikat Kelulusan v1.0");
        System.out.println("***********************\n");

        System.out.print("Masukkan IPK mahasiswa: ");
        ipk = in.nextDouble();
        System.out.print("Masukkan masa studi mahasiswa (tahun): ");
        masaStudi = in.nextDouble();
        System.out.print(
            "Apakah mahasiswa memiliki nilai lulus di bawah B? (Y/T) "
        );
        matkulDiBawahB = in.next().charAt(0);
        in.close();

        if (ipk > 3.5 && matkulDiBawahB == 'T' && masaStudi <= 4) {
            System.out.println(
                "\nMahasiswa lulus dengan predikat Dengan Pujian.\n"
            );
        } else if (ipk > 2.75) {
            System.out.println(
                "\nMahasiswa lulus dengan predikat Sangat Memuaskan.\n"
            );
        } else if (ipk >= 2.0) {
            System.out.println(
                "\nMahasiswa lulus dengan predikat Memuaskan.\n"
            );
        }

        System.out.print("Terima kasih telah menggunakan layanan ini.");
    }
}
