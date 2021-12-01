package PrakPemdas.TugasKe9Latihan8;

import java.util.Scanner;

public class UbjekFinal {
    static int nDriver;
    static int nRute;

    static String costumerName;
    static double[] costumerPos = new double[2]; // index 0 = x; index 1 = y
    static String[] driverName;
    static double[][] driverPos;
    static double[][] rute;

    static double totalDistance;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ;
    }

    static void input() {
        costumerName = in.nextLine();
        costumerPos[0] = in.nextDouble();
        costumerPos[1] = in.nextDouble();

        nDriver = in.nextInt();
        driverName = new String[nDriver];
        driverPos = new double[nDriver][2];
    }
    
    static void calculate() {
        ;
    }

    static void output() {
        ;
    }

    static int findNearestPointIndex(double startingPoint, double[] destination) {
        return 0;
    }

    static double calcDistance(double point1, double point2) {
        return 0;
    }

    static void header() {
        ;
    }

    static void footer() {
        ;
    }

    static void separator() {
        ;
    }
}
