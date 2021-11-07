package PrakPemdas.HR5;

import java.util.Locale;
import java.util.Scanner;

public class ubjek4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        int order;
        float distance = 0;

        name = in.nextLine();
        order = in.nextInt();
        for (int i = 0; i < order; i++) {
            distance += in.nextFloat();
        }
        in.close();

        System.out.println("Nama Driver : " + name);
        System.out.println("Jumlah KM : " + distance + " Km");
        System.out.printf(Locale.ITALY, "Total Pendapatan Kotor : Rp%,.2f\n", distance * 2000);
        if (order >= 5)
            System.out.printf(Locale.ITALY, "Total Pendapatan Bersih + Bonus : Rp%,.2f\n",
                    distance * 2000 * 0.8f + 50000);
        else
            System.out.printf(Locale.ITALY, "Total Pendapatan Bersih : Rp%,.2f\n", distance * 2000 * 0.8f);
        System.out.printf(Locale.ITALY, "Biaya Sistem UB-JEK : Rp%,.2f\n", distance * 2000 * 0.2f);
    }
}