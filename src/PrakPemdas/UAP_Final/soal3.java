package PrakPemdas.UAP_Final;

import java.util.Scanner;

public class soal3 {

    static int nAnakTangga, kelipatanLangkah;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        cetak();
    }

    public static void input() {
        nAnakTangga = in.nextInt();
        kelipatanLangkah = in.nextInt();
        in.close();
    }

    public static int nLangkah(int AnakTangga, int kelipatan) {
        int kemungkinanDuaLangkah = nAnakTangga / 2;
        int satuLangkah = 0;
        int sisaAnakTangga;
        int totalLangkah;
        while (true) {
            sisaAnakTangga = AnakTangga;
            totalLangkah = 0;

            for (int i = 0; i < kemungkinanDuaLangkah; i++) {
                totalLangkah++;
                sisaAnakTangga -= 2;
                // System.out.print(sisaAnakTangga + " ");

                if (sisaAnakTangga % 2 == 1) {
                    totalLangkah++;
                    sisaAnakTangga--;
                    // System.out.print(sisaAnakTangga + " ");
                }
            }

            for (int j = 0; j < satuLangkah; j++) {
                totalLangkah++;
                sisaAnakTangga--;
                // System.out.print(sisaAnakTangga + " ");
            }

            // System.out.println();

            if (totalLangkah % kelipatanLangkah != 0) {
                kemungkinanDuaLangkah--;
                satuLangkah += 2;
            } else if (sisaAnakTangga < 0) {
                totalLangkah = -1;
                break;
            } else {
                break;
            }
        }
        return totalLangkah;
    }

    public static void cetak() {
        int banyakLangkah = nLangkah(nAnakTangga, kelipatanLangkah);
        if (banyakLangkah == 0)
            System.out.println(-1);
        else
            System.out.println(
                    banyakLangkah);
    }
}
