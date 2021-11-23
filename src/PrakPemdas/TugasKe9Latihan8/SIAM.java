package PrakPemdas.TugasKe9Latihan8;

import java.util.Scanner;

public class SIAM {
    static final byte MAX_MHS = 10;
    static final byte MAX_SEM = 2;
    static final byte MAX_MK = 8;

    static String[] nama           = new String[MAX_MHS];
    static String[] nim            = new String[MAX_MHS];
    static String[] prodi          = new String[MAX_MHS];
    static String[][][] matkul     = new String[MAX_MHS][MAX_SEM][MAX_MK];
    static String[][][] kodeMatkul = new String[MAX_MHS][MAX_SEM][MAX_MK];
    static String[][][] nilaiHuruf = new String[MAX_MHS][MAX_SEM][MAX_MK];
    static float[][][] nilaiAngka   = new float[MAX_MHS][MAX_SEM][MAX_MK];
    static byte[][][] sks          = new byte[MAX_MHS][MAX_SEM][MAX_MK];

    static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        header();
        menu();
        switch (IN.nextInt()) {
            case 1:
                inputDataMahasiswa(indeksKosong());
                break;
            default:
                break;
        }
        footer();
    }

    static void menu() {
        // cetak menu awal
        System.out.println("Pilihan menu:");
        System.out.println("[1] Input Data Mahasiswa");
        System.out.println("[2] Input Data KRS");
        System.out.println("[3] Edit Data KRS");
        System.out.println("[4] Input Nilai Mata Kuliah");
        System.out.println("[5] Edit Nilai Mata Kuliah");
        System.out.println("[6] Cetak KRS");
        System.out.println("[7] Cetak KHS");
        System.out.println("[0] Keluar");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Input Menu\t: ");
    }

    static void inputDataMahasiswa(int indeks) {
        // masukkan nama, nim, dan prodi mahasiswa
        System.out.println("======================================================================");
        System.out.println("                        INPUT DATA MAHASISWA                          ");
        System.out.println("----------------------------------------------------------------------");

        IN.nextLine();
        System.out.print("Input Nama\t: ");
        nama[indeks] = IN.nextLine();
        System.out.print("Input NIM\t: ");
        nim[indeks] = IN.nextLine();
        System.out.print("Input Prodi\t: ");
        prodi[indeks] = IN.nextLine();

        System.out.println("======================================================================");
    }

    static byte indeksKosong() {
        // mencari indeks mahasiswa dalam array yang masih kosong
        byte i = 0;
        while (i < MAX_MHS) {
            if (nama[i] == null) {
                break;
            }
            i++;
        }
        return i;
    }

    static byte indeksMahasiswa(String nimMhs) {
        // cari indeks mahasiswa berdasarkan NIM
        byte i = 0;
        while (i < MAX_MHS) {
            if (nim[i].equals(nimMhs)) {
                break;
            }
            i++;
        }
        return i;
    }

    static byte indeksMatkul(String kodeMK, int indeksMhs, byte sem) {
        // cari indeks mata kuliah berdasarkan kode mata kuliah, indeks mahasiswa dalam array, dan semester
        byte i = 0;
        while (i < MAX_MK) {
            if (matkul[indeksMhs][sem][i].equals(kodeMK)) {
                break;
            }
            i++;
        }
        return i;
    }

    static void inputNilaiAngka() {
        // menginputkan nilai angka mata kuliah
    }

    static void editNilaiAngka() {
        // mengedit nilai angka mata kuliah
    }

    static String konversiNilai(float nilai) {
        // mengonversi nilai angka menjadi nilai huruf
        if (nilai > 3.49f)
            return "A";
        else if (nilai > 2.99f)
            return "B+";
        else if (nilai > 2.49f)
            return "B";
        else if (nilai > 1.99f)
            return "C";
        else if (nilai > 1.49f)
            return "D";
        else
            return "E";
    }

    static byte totalSKS(int indeksMhs, int sem) {
        // menghitung total SKS yang diambil oleh mahasiswa dalam satu semester
        return 0;
    }

    static double ip(int indeksMhs, int sem) {
        // menghitung IP semester
        return 0;
    }

    static byte maksSKS(int indeksMhs, int sem) {
        // menghitung jumlah maksimal SKS yang bisa diambil
        return 0;
    }

    static void inputKRS() {
        // menginput data-data KRS
    }

    static void editKRS() {
        // mengedit data-data KRS (tugas 7)
    }

    static void cetakKRS() {
        // mencetak KRS
    }

    static void inputKHS() {
        // menginput data-data KHS
    }

    static void editKHS() {
        // mengedit data-data KHS (tugas 7)
    }

    static void cetakKHS() {
        // mencetak KHS
    }

    static void header() {
        // menampilkan header
        System.out.println("======================================================================");
        System.out.println("               APLIKASI KRS/KHS MAHASISWA FILKOM UB                   ");
        System.out.println("======================================================================");
    }

    static void footer() {
        // menampilkan footer
        System.out.println("======================================================================");
        System.out.println("                            Terima Kasih                              ");
        System.out.println("======================================================================");
    }
}
