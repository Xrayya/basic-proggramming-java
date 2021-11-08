package PrakPemdas.TugasKe7;

import java.util.Scanner;

public class khs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, prodi, kodeMatkul[], namaMatkul[];
        byte nMatkul, sks[], sksTotal;
        float nilaiMatkul[], nilaiMatkulTotal, ip;
        sksTotal = 0;
        nilaiMatkulTotal = 0;

        nama = in.nextLine();
        nim = in.nextLine();
        prodi = in.nextLine();
        nMatkul = in.nextByte();
        in.nextLine();

        kodeMatkul = new String[nMatkul];
        namaMatkul = new String[nMatkul];
        sks = new byte[nMatkul];
        nilaiMatkul = new float[nMatkul];

        for (int i = 0; i < nMatkul; i++) {
            kodeMatkul[i] = in.nextLine();
            // System.out.println("a");
            namaMatkul[i] = in.nextLine();
            // System.out.println("b");
            sks[i] = in.nextByte();
            // System.out.println("c");
            nilaiMatkul[i] = in.nextFloat();
            // System.out.println("d");
            in.nextLine();
            // System.out.println("e");

            sksTotal += sks[i];
            nilaiMatkulTotal += nilaiMatkul[i] * sks[i];
        }

        ip = nilaiMatkulTotal / sksTotal;

        // nama = "AZHARY MUNIR ABDILLAH";
        // nim = "215150400111015";
        // prodi = "SISTEM INFORMASI";

        System.out.println();
        System.out.println("================================================================================");
        System.out.printf("Nama \t\t: %s\n", nama);
        System.out.printf("NIM \t\t: %s\n", nim);
        System.out.printf("Program Studi \t: %s\n", prodi);
        System.out.printf("Semester \t: GANJIL 2021/2022\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %-5s %s\n", "No", "Kode Mata Kuliah", "Nama Mata Kuliah", "SKS", "Nilai");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < nMatkul; i++) {
            System.out.printf("%-5s %-18s %-43s %-5s ", i + 1, kodeMatkul[i], namaMatkul[i], sks[i]);
            if (nilaiMatkul[i] > 3.49f)
                System.out.println("A");
            else if (nilaiMatkul[i] > 2.99f)
                System.out.println("B+");
            else if (nilaiMatkul[i] > 2.49f)
                System.out.println("B");
            else if (nilaiMatkul[i] > 1.99f)
                System.out.println("C");
            else if (nilaiMatkul[i] > 1.49f)
                System.out.println("D");
            else
                System.out.println("E");
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %s\n", " ", "Jumlah SKS", " ", sksTotal);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("IP Semester \t: %.2f\n", ip);
        System.out.printf("Beban Studi \t: maksimum ");
        if (ip >= 3f)
            System.out.println("24 sks");
        else if (ip >= 2.5f)
            System.out.println("21 sks");
        else if (ip >= 2f)
            System.out.println("18 sks");
        else if (ip >= 1.5f)
            System.out.println("15 sks");
        else
            System.out.println("12 sks");
        System.out.println("================================================================================");

        in.close();
    }
}
