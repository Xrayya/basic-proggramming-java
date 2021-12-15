package PrakPemdas.HR8;

import java.util.Scanner;

public class pecahan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;
        int bilBul, pembilang, penyebut;
        double bil;

        num = in.nextLine();
        int c;

        // Memisahkan bil. bulat, pembilang, dan penyebut dari input
        if (num.indexOf('.') != -1) {
            // Desimal
            bil = Double.parseDouble(num);
            penyebut = 1;
            bilBul = 0;
            for (int i = 0; i < (num.length() - 1 - num.indexOf('.')); i++) {
                bil *= 10;
                penyebut *= 10;
            }
            pembilang = (int) Math.round(bil);
        } else if (num.indexOf('/') != -1 && num.indexOf(' ') != -1) {
            // Pecahan campuran
            bilBul = Integer.parseInt(num.substring(0, num.indexOf(' ')));
            penyebut =
                Integer.parseInt(
                    num.substring(num.indexOf('/') + 1, num.length())
                );
            pembilang =
                Integer.parseInt(
                    num.substring(num.indexOf(' ') + 1, num.indexOf('/'))
                ) *
                bilBul /
                Math.abs(bilBul) +
                bilBul *
                penyebut;
            bilBul = 0;
        } else if (num.indexOf('/') != -1) {
            // Pecahan
            bilBul = 0;
            pembilang = Integer.parseInt(num.substring(0, num.indexOf('/')));
            penyebut =
                Integer.parseInt(
                    num.substring(num.indexOf('/') + 1, num.length())
                );
        } else {
            // Bulat
            bilBul = (int) Integer.parseInt(num);
            pembilang = 0;
            penyebut = 1;
        }

        // Penyederhanaan pecahan
        bil = 0;
        if (pembilang % penyebut == 0 && pembilang != 0) {
            bil += pembilang / penyebut;
            bilBul += pembilang / penyebut;
            pembilang = 0;
            penyebut = 1;
        }
        if (Math.abs(pembilang) > penyebut) {
            bilBul += pembilang / penyebut;
            pembilang = pembilang % penyebut;
        }
        int j = Math.abs(pembilang);
        while (Math.abs(pembilang) > 1 && j > 0) {
            if (Math.abs(pembilang) % j == 0 && penyebut % j == 0) {
                pembilang /= j;
                penyebut /= j;
            }
            j--;
        }

        // Cetak
        System.out.printf("Desimal: ");
        if (bil != 0) {
            System.out.println(bil);
        } else if (pembilang == 0) {
            System.out.println(bilBul);
        } else {
            System.out.println(bilBul + (double) pembilang / (double) penyebut);
        }
        System.out.printf("Pecahan campuran: ");
        if (bil != 0) {
            System.out.println(bil);
        } else if (pembilang == 0) {
            System.out.println(bilBul);
        } else if (bilBul == 0) {
            System.out.println(pembilang + "/" + penyebut);
        } else {
            System.out.println(
                bilBul +
                " " +
                pembilang *
                (bilBul / Math.abs(bilBul)) +
                "/" +
                penyebut
            );
        }
        System.out.printf("Pecahan: ");
        if (bil != 0) {
            System.out.println(bil);
        } else if (pembilang == 0) {
            System.out.println(bilBul);
        } else {
            System.out.println(bilBul * penyebut + pembilang + "/" + penyebut);
        }
        in.close();
    }
}
