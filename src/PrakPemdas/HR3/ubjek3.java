package PrakPemdas.HR3;

import java.util.Locale;
import java.util.Scanner;

public class ubjek3 {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        float x1, y1, x2, y2, d1x, d1y, d2x, d2y, d3x, d3y, d1dist, d2dist, d3dist, jarak, biaya;
        String driver1, driver2, driver3;

        x1 = io.nextFloat();
        y1 = io.nextFloat();
        x2 = io.nextFloat();
        y2 = io.nextFloat();
        driver1 = io.next();
        d1x = io.nextFloat();
        d1y = io.nextFloat();
        driver2 = io.next();
        d2x = io.nextFloat();
        d2y = io.nextFloat();
        driver3 = io.next();
        d3x = io.nextFloat();
        d3y = io.nextFloat();
        io.close();

        d1dist =
            (float) (
                Math.sqrt(Math.pow((d1x - x1), 2) + Math.pow((d1y - y1), 2))
            );
        d2dist =
            (float) (
                Math.sqrt(Math.pow((d2x - x1), 2) + Math.pow((d2y - y1), 2))
            );
        d3dist =
            (float) (
                Math.sqrt(Math.pow((d3x - x1), 2) + Math.pow((d3y - y1), 2))
            );

        jarak =
            (float) Math.round(
                Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))
            );
        biaya = jarak * 2000;

        if (d1dist < d2dist && d1dist < d3dist) {
            System.out.printf(
                "Driver yang akan menjemput anda adalah %s\n",
                driver1
            );
        } else if (d2dist < d3dist) {
            System.out.printf(
                "Driver yang akan menjemput anda adalah %s\n",
                driver2
            );
        } else {
            System.out.printf(
                "Driver yang akan menjemput anda adalah %s\n",
                driver3
            );
        }

        System.out.printf(
            "Biaya perjalanan yang akan ditempuh sejauh %.2f KM adalah Rp",
            jarak
        );
        System.out.printf(Locale.ITALY, "%,.2f", biaya);
    }
}
