// Nama  : Azhary Munir Abdillah
// NIM   : 215150400111015

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
        String nimMhs, sem, kodeMK;
        byte pilihan;
        header_ofProgram();
        do {
            menu();
            pilihan = IN.nextByte();
            IN.nextLine();
            switch (pilihan) {
                case 1:
                    inputDataMahasiswa();
                    break;
                case 2:
                    inputDataKRS();
                    break;
                case 3:
                    editDataKRS();
                    break;
                case 4:
                    header_inputNilaiMataKuliah();
                    System.out.print("Masukkan NIM\t\t: ");
                    nimMhs = IN.next();
                    if (indeksMahasiswa(nimMhs) == MAX_MHS) {
                        System.out.println("NIM tidak ditemukan, silahkan input data mahasiswa terlebih dahulu");
                        System.out.println("Saran: Pilih [1] pada menu dan input data mahasiswa");
                        footer_bold();
                        break;
                    }
                    System.out.print("Masukkan semester\t: ");
                    sem = IN.next();
                    IN.nextLine();
                    if (kodeMatkul[indeksMahasiswa(nimMhs)][semester(sem)][0] == null) {
                        System.out.println("Semester tidak ditemukan, silahkan input data terlebih dahulu");
                        System.out.println("Saran: Pilih [2] pada menu dan input data KRS");
                        footer_bold();
                        break;
                    }
                    if (nilaiAngka[indeksMahasiswa(nimMhs)][semester(sem)][0] != 0) {
                        System.out.println("Nilai sudah diinput");
                        System.out.println("Saran: Pilih [5] untuk mengedit nilai");
                        footer_bold();
                        break;
                    }
                    separator();
                    inputNilaiAngka(indeksMahasiswa(nimMhs), semester(sem));
                    footer_bold();
                    break;
                case 5:
                    header_editNilaiMataKuliah();
                    System.out.print("Masukkan NIM\t\t: ");
                    nimMhs = IN.next();
                    if (indeksMahasiswa(nimMhs) == MAX_MHS) {
                        System.out.println("NIM tidak ditemukan, silahkan input data mahasiswa terlebih dahulu");
                        System.out.println("Saran: Pilih [1] pada menu dan input data mahasiswa");
                        footer_bold();
                        break;
                    }
                    System.out.print("Masukkan semester\t: ");
                    sem = IN.next();
                    if (kodeMatkul[indeksMahasiswa(nimMhs)][semester(sem)][0] == null) {
                        System.out.println("Semester tidak ditemukan, silahkan input data terlebih dahulu");
                        System.out.println("Saran: Pilih [2] pada menu dan input data KRS");
                        footer_bold();
                        break;
                    }
                    System.out.print("Masukkan kode mata kuliah yang ingin diubah\t: ");
                    kodeMK = IN.next();
                    if (indeksMatkul(indeksMahasiswa(nimMhs), semester(sem), kodeMK) == MAX_MK) {
                        System.out.println("Mata kuliah tidak ditemukan, periksa kembali kode mata kuliah yang diinput");
                        footer_bold();
                        break;
                    } 
                    IN.nextLine();
                    separator();
                    editNilaiAngka(indeksMahasiswa(nimMhs), semester(sem), indeksMatkul(indeksMahasiswa(nimMhs), semester(sem), kodeMK));
                    footer_bold();
                    break;
                case 6:
                    header_cetakKRS();
                    System.out.print("Masukkan NIM\t\t: ");
                    nimMhs = IN.next();
                    if (indeksMahasiswa(nimMhs) == MAX_MHS) {
                        System.out.println("NIM tidak ditemukan, silahkan input data mahasiswa terlebih dahulu");
                        System.out.println("Saran: Pilih [1] pada menu dan input data mahasiswa");
                        footer_bold();
                        break;
                    }
                    System.out.print("Masukkan semester\t: ");
                    sem = IN.next();
                    if (kodeMatkul[indeksMahasiswa(nimMhs)][semester(sem)][0] == null) {
                        System.out.println("Semester tidak ditemukan, silahkan input data terlebih dahulu");
                        System.out.println("Saran: Pilih [2] pada menu dan input data KRS");
                        footer_bold();
                        break;
                    }
                    cetakKRS(indeksMahasiswa(nimMhs), semester(sem));
                    break;
                case 7:
                    header_cetakKHS();
                    System.out.print("Masukkan NIM\t\t: ");
                    nimMhs = IN.next();
                    if (indeksMahasiswa(nimMhs) == MAX_MHS) {
                        System.out.println("NIM tidak ditemukan, silahkan input data mahasiswa terlebih dahulu");
                        System.out.println("Saran: Pilih [1] pada menu dan input data mahasiswa");
                        footer_bold();
                        break;
                    }
                    System.out.print("Masukkan semester\t: ");
                    sem = IN.next();
                    if (nilaiAngka[indeksMahasiswa(nimMhs)][semester(sem)][0] == 0) {
                        System.out.println("Semester tidak ditemukan, silahkan input data terlebih dahulu");
                        System.out.println("Saran: Pilih [2] pada menu dan input data KRS");
                        footer_bold();
                        break;
                    }
                    cetakKHS(indeksMahasiswa(nimMhs), semester(sem));
                    break;
                default:
                    if (pilihan != 0) {
                        System.out.println("Pilihan tidak ditemukan");
                        footer_bold();
                    }
                    break;
            }
        } while (pilihan != 0);
        footer_ofProgram();
    }

    static void menu() {
        // cetak menu awal
        System.out.println("Menu:");
        System.out.println("[1] Input Data Mahasiswa");
        System.out.println("[2] Input Data KRS");
        System.out.println("[3] Edit Data KRS");
        System.out.println("[4] Input Nilai Mata Kuliah");
        System.out.println("[5] Edit Nilai Mata Kuliah");
        System.out.println("[6] Cetak KRS");
        System.out.println("[7] Cetak KHS");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Input Menu\t: ");
    }

    static void inputDataMahasiswa() {
        byte indeks;

        header_inputDataMahasiswa();

        indeks = indeksKosong();
        System.out.print("Input Nama\t: ");
        nama[indeks] = IN.nextLine();
        System.out.print("Input NIM\t: ");
        nim[indeks] = IN.nextLine();
        System.out.print("Input Prodi\t: ");
        prodi[indeks] = IN.nextLine();

        footer_bold();
    }

    static byte indeksKosong() {
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
        byte i = 0;
        while (i < MAX_MHS) {
            if (nim[i] != null) {
                if (nim[i].equals(nimMhs)) {
                    break;
                }
            }
            i++;
        }
        return i;
    }

    static byte indeksMatkul(byte indeksMhs, byte sem, String kodeMK) {
        byte i = 0;
        while (i < MAX_MK) {
            if (kodeMatkul[indeksMhs][sem][i].equals(kodeMK)) {
                break;
            }
            i++;
        }
        return i;
    }

    static byte semester(String sem) {
        if (sem.toLowerCase().contains("ganjil")) {
            return 0;
        } else {
            return 1;
        }
    }

    static void inputNilaiAngka(byte indeksMhs, byte sem) {
        for (int i = 0; i < MAX_MK; i++) {
            System.out.printf("   Masukkan nilai mata kuliah %s: ", matkul[indeksMhs][sem][i]);
            nilaiAngka[indeksMhs][sem][i] = IN.nextFloat();
        }
    }

    static void editNilaiAngka(byte indeksMhs, byte sem, byte indeksMK) {
        // mengedit nilai angka mata kuliah
        System.out.printf("   Masukkan nilai mata kuliah %s yang baru: ", matkul[indeksMhs][sem][indeksMK]);
        nilaiAngka[indeksMhs][sem][indeksMK] = IN.nextFloat();
    }

    static String konversiNilaiKeHuruf(float nilai) {
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

    static byte totalSKS(byte indeksMhs, byte sem) {
        // menghitung total SKS yang diambil oleh mahasiswa dalam satu semester
        byte total = 0;
        for (int i = 0; i < MAX_MK; i++) {
            total += sks[indeksMhs][sem][i];
        }
        return total;
    }

    static float ip(byte indeksMhs, byte sem) {
        // menghitung IP semester
        float nilaiMKTotal = 0;
        for (int i = 0; i < MAX_MK; i++) {
            nilaiMKTotal += nilaiAngka[indeksMhs][sem][i] * sks[indeksMhs][sem][i];
        }
        nilaiMKTotal /= totalSKS(indeksMhs, sem);
        return nilaiMKTotal;
    }

    static byte maksSKS(float ip) {
        // menghitung jumlah maksimal SKS yang bisa diambil
        if (ip >= 3f)
            return 24;
        else if (ip >= 2.5f)
            return 21;
        else if (ip >= 2f)
            return 18;
        else if (ip >= 1.5f)
            return 15;
        else
            return 12;
    }

    static boolean cekNIMTerinput(String nimMhs){
        boolean terinput = true;

        if (indeksMahasiswa(nimMhs) == MAX_MHS) {
            System.out.println("NIM tidak ditemukan, silahkan input data mahasiswa terlebih dahulu");
            System.out.println("Saran: Pilih [1] pada menu dan input data mahasiswa");
            footer_bold();
            terinput = false;
        }
        return terinput;
    }

    static boolean cekSemTerinput(String nimMhs, String sem) {
        byte indeksMhs, indeksSem;
        boolean terinput = true;

        indeksMhs = indeksMahasiswa(nimMhs);
        indeksSem = semester(sem);
        if (kodeMatkul[indeksMhs][indeksSem][0] == null) {
            System.out.println("Semester tidak ditemukan, silahkan input data terlebih dahulu");
            System.out.println("Saran: Pilih [2] pada menu dan input data KRS");
            footer_bold();
            terinput = false;
        }
        return terinput;
    }

    static void inputDataKRS() {
        String nimMhs, sem;
        boolean nimTerinput, semTerinput;
        byte indeksMhs, indeksSem;

        header_inputDataKRS();

        System.out.print("Masukkan NIM\t\t: ");
        nimMhs = IN.next();
        nimTerinput = cekNIMTerinput(nimMhs);

        if (nimTerinput) {
            System.out.print("Masukkan semester\t: ");
            sem = IN.next();
            IN.nextLine();

            semTerinput = false;
            if (kodeMatkul[indeksMahasiswa(nimMhs)][semester(sem)][0] != null) {
                System.out.println("Data mahasiswa sudah diinput, tindakan ini dapat menyebabkan overwrite");
                System.out.println("Saran: Pilih [3] untuk mengedit data KRS");
                footer_bold();
                semTerinput = true;
            }

            if (nimTerinput && !semTerinput) {
                indeksMhs = indeksMahasiswa(nimMhs);
                indeksSem = semester(sem);

                separator();
                for (int i = 0; i < MAX_MK; i++) {
                    System.out.printf("   Masukkan kode mata kuliah ke-%d\t: ", i + 1);
                    kodeMatkul[indeksMhs][indeksSem][i] = IN.nextLine();
                    System.out.printf("   Masukkan nama mata kuliah ke-%d\t: ", i + 1);
                    matkul[indeksMhs][indeksSem][i] = IN.nextLine();
                    System.out.printf("   Masukkan SKS mata kuliah ke-%d\t: ", i + 1);
                    sks[indeksMhs][indeksSem][i] = IN.nextByte();
                    IN.nextLine();
                }
                footer_bold();
            }
        }
    }

    static void editDataKRS() {
        String nimMhs, sem, kodeMK;
        boolean nimTerinput, semTerinput, kodeMKTerinput;
        byte indeksMhs, indeksSem, indeksKodeMK;

        header_editDataKRS();

        System.out.print("Masukkan NIM\t\t: ");
        nimMhs = IN.next();
        nimTerinput = cekNIMTerinput(nimMhs);

        if (nimTerinput) {
            System.out.print("Masukkan semester\t: ");
            sem = IN.next();
            semTerinput = cekSemTerinput(nimMhs, sem);

            if (nimTerinput && semTerinput) {
                indeksMhs = indeksMahasiswa(nimMhs);
                indeksSem = semester(sem);

                System.out.print("Masukkan kode mata kuliah yang ingin diubah\t: ");
                kodeMK = IN.next();
                IN.nextLine();

                indeksKodeMK = indeksMatkul(indeksMhs, indeksSem, kodeMK);
                kodeMKTerinput = true;
                if (indeksMatkul(indeksMahasiswa(nimMhs), semester(sem), kodeMK) == MAX_MK) {
                    System.out.println("Mata kuliah tidak ditemukan, periksa kembali kode mata kuliah yang diinput");
                    footer_bold();
                    kodeMKTerinput = false;
                } 

                if (nimTerinput && semTerinput && kodeMKTerinput) {
                    separator();
                    System.out.printf("   Masukkan kode mata kuliah yang baru\t: ");
                    kodeMatkul[indeksMhs][indeksSem][indeksKodeMK] = IN.nextLine();
                    System.out.printf("   Masukkan nama mata kuliah yang baru\t: ");
                    matkul[indeksMhs][indeksSem][indeksKodeMK] = IN.nextLine();
                    System.out.printf("   Masukkan SKS mata kuliah yang baru\t: ");
                    sks[indeksMhs][indeksSem][indeksKodeMK] = IN.nextByte();

                    footer_bold();
                }
            }
        }
    }

    static void cetakKRS(byte indeksMhs, byte sem) {
        // mencetak KRS
        String semester;
        if (sem == 0) {
            semester = "GANJIL";
        } else {
            semester = "GENAP";
        }
        System.out.println("================================================================================");
        System.out.printf("Nama \t\t: %s\n", nama[indeksMhs]);
        System.out.printf("NIM \t\t: %s\n", nim[indeksMhs]);
        System.out.printf("Program studi \t: %s\n", prodi[indeksMhs]);
        System.out.printf("Semester \t: %s\n", semester);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %-7s %s\n", "No", "Kode Mata Kuliah", "Nama Mata Kuliah", " ", "SKS");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < MAX_MK; i++) {
            System.out.printf("%-5s %-18s %-43s %-7s %s\n", i + 1, kodeMatkul[indeksMhs][sem][i], 
                matkul[indeksMhs][sem][i], " ", sks[indeksMhs][sem][i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %-7s %s\n", " ", "Jumlah SKS", " ", " ", totalSKS(indeksMhs, sem));
        System.out.println("================================================================================");
    }

    static void cetakKHS(byte indeksMhs, byte sem) {
        // mencetak KHS
        String semester;
        if (sem == 0) {
            semester = "GANJIL";
        } else {
            semester = "GENAP";
        }
        System.out.println("================================================================================");
        System.out.printf("Nama \t\t: %s\n", nama[indeksMhs]);
        System.out.printf("NIM \t\t: %s\n", nim[indeksMhs]);
        System.out.printf("Program studi \t: %s\n", prodi[indeksMhs]);
        System.out.printf("Semester \t: %s\n", semester);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %-5s %s\n", "No", "Kode Mata Kuliah", "Nama Mata Kuliah", "SKS", "Nilai");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < MAX_MK; i++) {
            System.out.printf("%-5s %-18s %-43s %-5s %s\n", i + 1, kodeMatkul[indeksMhs][sem][i], matkul[indeksMhs][sem][i],
                    sks[indeksMhs][sem][i], konversiNilaiKeHuruf(nilaiAngka[indeksMhs][sem][i]));
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-43s %s\n", " ", "Jumlah SKS", " ", totalSKS(indeksMhs, sem));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("IP Semester \t: %.2f\n", ip(indeksMhs, sem));
        System.out.printf("Beban Studi \t: maksimum %d sks\n", maksSKS(ip(indeksMhs, sem)));
        System.out.println("================================================================================");
    }

    static void header_ofProgram() {
        // menampilkan header
        System.out.println("================================================================================");
        System.out.println("                    APLIKASI KRS/KHS MAHASISWA FILKOM UB                        ");
        System.out.println("================================================================================");

    }

    static void header_inputDataMahasiswa() {
        System.out.println("================================================================================");
        System.out.println("                            INPUT DATA MAHASISWA                                ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_inputDataKRS() {
        System.out.println("================================================================================");
        System.out.println("                               INPUT DATA KRS                                   ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_editDataKRS() {
        System.out.println("================================================================================");
        System.out.println("                               EDIT DATA KHS                                    ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_inputNilaiMataKuliah() {
        System.out.println("================================================================================");
        System.out.println("                          INPUT NILAI MATA KULIAH                               ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_editNilaiMataKuliah() {
        System.out.println("================================================================================");
        System.out.println("                           EDIT NILAI MATA KULIAH                               ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_cetakKRS() {
        System.out.println("================================================================================");
        System.out.println("                                  CETAK KRS                                     ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void header_cetakKHS() {
        System.out.println("================================================================================");
        System.out.println("                                  CETAK KHS                                     ");
        System.out.println("--------------------------------------------------------------------------------");

    }

    static void footer_ofProgram() {
        // menampilkan footer
        System.out.println("================================================================================");
        System.out.println("                 TERIMA KASIH TELAH MENGGUNAKAN APLIKASI INI                    ");
        System.out.println("                   Copyright © 2021 Praktikum Pemdas SI-B                       ");
        System.out.println("================================================================================");
    }

    static void footer_bold() {
        System.out.println("================================================================================");
    }

    static void separator() {
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
    }
}
