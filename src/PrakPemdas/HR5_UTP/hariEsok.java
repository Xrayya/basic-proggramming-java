package PrakPemdas.HR5_UTP;

import java.util.Scanner;

public class hariEsok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int today, n, nNext;

        today = in.nextInt();
        n = in.nextInt();
        in.close();

        if (today > 6 || today < 0) {
            today = 1;
        }

        nNext = (today + n) % 7;

        System.out.print(n + " hari setelah hari ");

        switch (today) {
            case 0:
                System.out.print("Minggu");
                break;
            case 1:
                System.out.print("Senin");
                break;
            case 2:
                System.out.print("Selasa");
                break;
            case 3:
                System.out.print("Rabu");
                break;
            case 4:
                System.out.print("Kamis");
                break;
            case 5:
                System.out.print("Jumat");
                break;
            case 6:
                System.out.print("Sabtu");
                break;
        }

        System.out.print(" adalah hari ");

        switch (nNext) {
            case 0:
                System.out.print("Minggu");
                break;
            case 1:
                System.out.print("Senin");
                break;
            case 2:
                System.out.print("Selasa");
                break;
            case 3:
                System.out.print("Rabu");
                break;
            case 4:
                System.out.print("Kamis");
                break;
            case 5:
                System.out.print("Jumat");
                break;
            case 6:
                System.out.print("Sabtu");
                break;
        }
    }
}