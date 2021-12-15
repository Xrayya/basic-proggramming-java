package PrakPemdas.HR8;

import java.util.Scanner;

public class indexMahasiswa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama[], fakultas[], jurusan[], angkatan[], perintah1, perintah2;
        int banyakData, dataDitemukan;

        banyakData = in.nextInt();
        nama = new String[banyakData];
        fakultas = new String[banyakData];
        jurusan = new String[banyakData];
        angkatan = new String[banyakData];

        for (int i = 0; i < banyakData; i++) {
            nama[i] = in.next();
            fakultas[i] = in.next().toLowerCase();
            jurusan[i] = in.next().toLowerCase();
            angkatan[i] = in.next().toLowerCase();
        }

        do {
            perintah1 = in.next().toLowerCase();
            if (!perintah1.equals("selesai")) {
                perintah2 = in.nextLine().toLowerCase();
            } else {
                perintah2 = "null";
            }

            dataDitemukan = 0;
            switch (perintah1) {
                case "fakultas":
                    for (int j = 0; j < banyakData; j++) {
                        if (perintah2.equals(" " + fakultas[j])) {
                            System.out.println(nama[j]);
                            dataDitemukan++;
                        }
                    }
                    if (dataDitemukan == 0) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case "jurusan":
                    for (int j = 0; j < banyakData; j++) {
                        if (perintah2.equals(" " + jurusan[j])) {
                            System.out.println(nama[j]);
                            dataDitemukan++;
                        }
                    }
                    if (dataDitemukan == 0) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case "angkatan":
                    for (int j = 0; j < banyakData; j++) {
                        if (perintah2.equals(" " + angkatan[j])) {
                            System.out.println(nama[j]);
                            dataDitemukan++;
                        }
                    }
                    if (dataDitemukan == 0) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                default:
                    if (!perintah1.equals("selesai")) {
                        System.out.println("Pilihan salah");
                    }
            }
        } while (!perintah1.equals("selesai"));
        in.close();
    }
}
