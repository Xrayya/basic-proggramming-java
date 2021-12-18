package Eksperimen.Speedrun;

import java.util.Scanner;

public class Jumlah2Bil {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Inputkan bilangan pertama: ");
        String bil1 = in.next();
        System.out.print("Inputkan bilangan kedua: ");
        String bil2 = in.next();

        String hasil;
        if (bil1.contains(".") || bil2.contains(".")) {
            hasil = Double.toString(jumlah(Double.parseDouble(bil1), Double.parseDouble(bil2)));
        }
        else {
            hasil = Integer.toString(jumlah(Integer.parseInt(bil1), Integer.parseInt(bil2)));
        }

        System.out.println(hasil);
    }

    public static int jumlah(int bil1, int bil2) {
        return bil1 + bil2;
    }

    public static double jumlah(double bil1, double bil2) {
        return bil1 + bil2;
    }
}
