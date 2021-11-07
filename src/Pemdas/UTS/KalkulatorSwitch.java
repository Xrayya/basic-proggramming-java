package Pemdas.UTS;

import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {

        // ===========================
        // Kalkulator v1.b
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        double bil1, bil2, hasil;
        String operator;

        System.out.println("*************");
        System.out.println("Kalkulator v1.b");
        System.out.println("*************\n");

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = in.nextDouble();
        System.out.print("Masukkan operator aritmetika (+, -, *, atau /): ");
        operator = in.next();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = in.nextDouble();
        in.close();

        System.out.print("\nHasil operasi: ");
        switch (operator) {
            case "+":
                hasil = bil1 + bil2;
                System.out.print(hasil);
                break;
            case "-":
                hasil = bil1 - bil2;
                System.out.print(hasil);
                break;
            case "*":
                hasil = bil1 * bil2;
                System.out.print(hasil);
                break;
            case "/":
                hasil = bil1 / bil2;
                System.out.print(hasil);
                break;
        }
    }
}