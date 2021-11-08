package PrakPemdas.TugasKe7;

import java.util.Scanner;

public class khs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, prodi, kodeMatkul[], namaMatkul[];
        byte nMatkul, sks[];
        float nilaimatkul[];

        System.out.print("Masukkan nama mahasiswa: ");
        nama = in.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = in.next();
        System.out.print("Masukkan program studi mahasiswa: ");
        prodi = in.nextLine();
        System.out.print("Berapa banyak mata kuliah yang hendak diinputkan? ");
        nMatkul = in.nextByte();

        kodeMatkul = new String[nMatkul];
        namaMatkul = new String[nMatkul];
        sks = new byte[nMatkul];
        nilaimatkul = new float[nMatkul];

        System.out.println("Silahkan masukkan data dengan urutan: ");
        System.out.println("- Kode mata kuliah pertama");
        System.out.println("- Nama mata kuliah pertama");
        System.out.println("- Kredit (SKS) mata kuliah pertama");
        System.out.println("- Nilai mata kuliah pertama");
        System.out.println("- Kode mata kuliah kedua");
        System.out.println("- Nama mata kuliah kedua");
        System.out.println("- dan seterusnya sebanyak mata kuliah yang hendak diinputkan");

        for (int i = 0; i < nMatkul; i++) {
            kodeMatkul[i] = in.next();
            namaMatkul[i] = in.nextLine();
            sks[i] = in.nextByte();
            nilaimatkul[i] = in.nextFloat();
        }
    }
}
