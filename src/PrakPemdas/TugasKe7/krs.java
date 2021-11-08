package PrakPemdas.TugasKe7;

import java.util.Scanner;

public class krs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, prodi;
        String namaMatkul[] = new String[5];
        byte sks[] = new byte[5];
        byte sksTotal = 0;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = in.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = in.nextLine();
        System.out.print("Masukkan program studi mahasiswa: ");
        prodi = in.nextLine();
        System.out.println("Silahkan masukkan mata kuliah dan sksnya (lima mata kuliah)");

        for (int i = 0; i < sks.length; i++) {
            namaMatkul[i] = in.nextLine();
            sks[i] = in.nextByte();
            in.nextLine();
            sksTotal += sks[i];
        }

        System.out.println("=====================================================");
        System.out.printf("Nama \t\t: %s\n", nama);
        System.out.printf("NIM \t\t: %s\n", nim);
        System.out.printf("Program Studi \t: %s\n", prodi);
        System.out.printf("Semester \t: GANJIL 2021/2022\n");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-43s %s\n", "No", "Nama Mata Kuliah", "SKS");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < sks.length; i++) {
            System.out.printf("%-5s %-43s %s\n", i + 1, namaMatkul[i], sks[i]);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-43s %s\n", " ", "SKS Total", sksTotal);
        System.out.println("=====================================================");

        in.close();
    }
}