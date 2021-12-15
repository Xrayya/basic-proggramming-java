// ===========================
// Nama: Azhary Munir Abdillah
// NIM: 215150400111015
// ===========================

package PrakPemdas.TugasKe7;

import java.util.Scanner;

public class krs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, prodi, semester, namaMatkul[];
        byte sks[], sksTotal;
        namaMatkul = new String[5];
        sks = new byte[5];
        sksTotal = 0;

        nama = in.nextLine();
        nim = in.nextLine();
        prodi = in.nextLine();
        semester = in.nextLine();

        for (int i = 0; i < sks.length; i++) {
            namaMatkul[i] = in.nextLine();
            sks[i] = in.nextByte();
            in.nextLine();
            sksTotal += sks[i];
        }

        System.out.println();
        System.out.println(
            "====================================================="
        );
        System.out.printf("Nama \t\t: %s\n", nama);
        System.out.printf("NIM \t\t: %s\n", nim);
        System.out.printf("Program Studi \t: %s\n", prodi);
        System.out.printf("Semester \t: %s\n", semester);
        System.out.println(
            "-----------------------------------------------------"
        );
        System.out.printf("%-5s %-43s %s\n", "No", "Nama Mata Kuliah", "SKS");
        System.out.println(
            "-----------------------------------------------------"
        );
        for (int i = 0; i < sks.length; i++) {
            System.out.printf("%-5s %-43s %s\n", i + 1, namaMatkul[i], sks[i]);
        }
        System.out.println(
            "-----------------------------------------------------"
        );
        System.out.printf("%-5s %-43s %s\n", " ", "SKS Total", sksTotal);
        System.out.println(
            "====================================================="
        );

        in.close();
    }
}
