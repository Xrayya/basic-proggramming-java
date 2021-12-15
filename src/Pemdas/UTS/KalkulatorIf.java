package Pemdas.UTS;

import java.util.Scanner;

public class KalkulatorIf {

    public static void main(String[] args) {
        // ===========================
        // Kalkulator v1.a
        // Oleh Azhary Munir Abdillah
        // ===========================

        Scanner in = new Scanner(System.in);
        double bil1, bil2;
        char operator;

        System.out.println("*************");
        System.out.println("Kalkulator v1.a");
        System.out.println("*************\n");

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = in.nextDouble();
        System.out.print("Masukkan operator aritmetika (+, -, *, atau /): ");
        operator = in.next().charAt(0);
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = in.nextDouble();
        in.close();

        System.out.print("\nHasil operasi: ");
        if (operator == '+') {
            System.out.println(bil1 + bil2);
        } else if (operator == '-') {
            System.out.println(bil1 - bil2);
        } else if (operator == '*') {
            System.out.println(bil1 * bil2);
        } else if (operator == '/') {
            System.out.println(bil1 / bil2);
        }
    }
}
