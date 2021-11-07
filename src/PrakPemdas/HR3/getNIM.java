package PrakPemdas.HR3;

import java.util.Scanner;

public class getNIM {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        String nim, tahun, fakultas, prodi, jalur, nomor;

        nim = io.next();
        io.close();

        tahun = nim.substring(0, 2);
        fakultas = nim.substring(2, 5);
        prodi = nim.substring(5, 8);
        jalur = nim.substring(8, 12);
        nomor = nim.substring(12, 15);

        System.out.println("Angkatan : 20" + tahun);
        switch (fakultas) {
            case "515":
                System.out.println("Fakultas : FILKOM");
                switch (prodi) {
                    case "020":
                        System.out.println("Prodi : TIF");
                        break;
                    case "030":
                        System.out.println("Prodi : TEKKOM");
                        break;
                    case "040":
                        System.out.println("Prodi : SI");
                        break;
                    case "050":
                        System.out.println("Prodi : TI");
                        break;
                    case "060":
                        System.out.println("Prodi : PTI");
                        break;
                    default:
                        System.out.println("Prodi : Unknown");
                        break;
                }
                break;
            case "514":
                System.out.println("Fakultas : FMIPA");
                switch (prodi) {
                    case "050":
                        System.out.println("Prodi : Biologi");
                        break;
                    case "051":
                        System.out.println("Prodi : Kimia");
                        break;
                    case "060":
                        System.out.println("Prodi : Fisika");
                        break;
                    case "061":
                        System.out.println("Prodi : Matematika");
                        break;
                    default:
                        System.out.println("Prodi : Unknown");
                        break;
                }
                break;
            default:
                System.out.println("Fakultas : Unknown");
                System.out.println("Prodi : Unknown");
                break;
        }
        switch (jalur) {
            case "0111":
                System.out.println("Jalur Masuk : SBMPTN");
                break;
            case "1111":
                System.out.println("Jalur Masuk : SNMPTN");
                break;
            case "7111":
                System.out.println("Jalur Masuk : Mandiri");
                break;
            default:
                System.out.println("Jalur Masuk : Unknown");
                break;
        }
        System.out.print("Nomor Mahasiswa : " + nomor);
    }
}