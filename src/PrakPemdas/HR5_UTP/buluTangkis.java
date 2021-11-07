package PrakPemdas.HR5_UTP;

import java.util.Scanner;

public class buluTangkis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cuaca, suhu, kelembapan, angin, hari, mood;
        int dorongan = 0;

        cuaca = in.next();
        suhu = in.next();
        kelembapan = in.next();
        angin = in.next();
        hari = in.next();
        mood = in.next();
        in.close();

        if (cuaca.equals("cerah") || cuaca.equals("mendung")) {
            dorongan++;
        }
        if (suhu.equals("sedang")) {
            dorongan++;
        }
        if (kelembapan.equals("normal")) {
            dorongan++;
        }
        if (angin.equals("stabil")) {
            dorongan++;
        }
        if (hari.equals("pagi") || hari.equals("siang")) {
            dorongan++;
        }

        if (mood.equals("bagus")) {
            System.out.println("Toni pergi berlatih");
        } else if (cuaca.equals("hujan")) {
            System.out.println("Toni tidak pergi berlatih");
        } else if (cuaca.equals("cerah") && suhu.equals("panas") && hari.equals("siang")) {
            System.out.println("Toni tidak pergi berlatih");
        } else if (suhu.equals("sedang") && angin.equals("labil")) {
            System.out.println("Toni pergi berlatih");
        } else if (dorongan >= 3) {
            System.out.println("Toni pergi berlatih");
        } else {
            System.out.println("Toni tidak pergi berlatih");
        }
    }
}