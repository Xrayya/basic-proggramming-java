package Eksperimen.Speedrun;

import java.util.Scanner;

public class triangle {
    // TODO:
    // - Equilateral triangle (normal and inverted)
    // - Right triangle (normal and inverted)
    // - Pascal tringle

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opt, height;

        System.out.println("Option:");
        System.out.println("1. Equilateral triangle");
        System.out.println("2. Inverted equilateral triangle");
        System.out.println("3. Right tringle");
        System.out.println("4. Inverted right triangle");
        System.out.println("5. Pascal triangle");

        System.out.print("Choose option\t\t\t: ");
        opt = in.nextInt();
        System.out.print("Input the height of tringle\t: ");
        height = in.nextInt();

        switch (opt) {
            case 1:
                equilateralTriangle(height);
                break;
            case 2:
                equilateralTriangle_inverted(height);
                break;
            case 3:
                rightTringle(height);
                break;
            case 4:
                rightTringle_inverted(height);
                break;
            case 5:
                pascalTriangle(height);
                break;
            case 6:
                equilateralTriangle_another(height);
                break;
        }
    }

    public static void equilateralTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < height - i + 1; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }

    public static void equilateralTriangle_another(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < height - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void equilateralTriangle_inverted(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= 2 * (height - i + 1) - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }

    public static void rightTringle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }

    public static void rightTringle_inverted(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }

    public static void pascalTriangle(int height) {
        ;
    }
}
