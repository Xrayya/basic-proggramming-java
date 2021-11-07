package PrakPemdas.HR6;

import java.util.Scanner;

public class prima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nBil, i, bil, faktor;

        nBil = in.nextInt();
        in.close();

        i = 1;
        bil = 2;
        while (i <= nBil) {
            faktor = 0;

            for (int j = 1; j <= bil; j++) {
                if (bil % j == 0)
                    faktor++;
            }

            if (faktor == 2) {
                System.out.printf("%d ", bil);
                i++;
            }

            bil++;
        }
    }
}