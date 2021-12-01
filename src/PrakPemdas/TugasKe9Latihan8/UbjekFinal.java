package PrakPemdas.TugasKe9Latihan8;

import java.util.Scanner;

public class UbjekFinal {
    static int nDriver;
    static int nRoute;

    static String costumerName;
    static double[] costumerPos = new double[2]; // index 0 = x; index 1 = y
    static double[] destination = new double[2]; // index 0 = x; index 1 = y
    static String[] driverName;
    static double[][] driverPos;
    static double[][][] route;

    static double totalDistance;

    static char[] pointChar = new char[4];

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        header();
        input();
        process();
        output();
        footer();
    }

    static void input() {
        costumerName = in.nextLine();
        costumerPos[0] = in.nextDouble();
        costumerPos[1] = in.nextDouble();

        destination[0] = in.nextDouble();
        destination[1] = in.nextDouble();

        nDriver = in.nextInt();
        in.nextLine();
        driverName = new String[nDriver];
        driverPos = new double[nDriver][2];
        // dimensi kedua : index 0 = x; index 1 = y

        for (int i = 0; i < nDriver; i++) {
            driverName[i] = in.nextLine();
            driverPos[i][0] = in.nextDouble();
            driverPos[i][1] = in.nextDouble();
            in.nextLine();
        }

        nRoute = in.nextInt();
        route = new double[2][nRoute][2];
        // dimensi pertama = titik rute (titik 2 / 3); dimensi kedua = indeks rute; dimensi ketiga =  x / y
        // memudahkan saat pemanggilan method findNearestPointIndex

        for (int i = 0; i < nRoute; i++) {
            route[i][0][0] = in.nextDouble();
            route[i][0][1] = in.nextDouble();
            route[i][1][0] = in.nextDouble();
            route[i][1][1] = in.nextDouble();
        }
    }
    
    static void process() {
        int RouteIndexOfPoint2, RouteIndexOfPoint3;

        totalDistance = 0;
        pointChar[0] = 'P';
        
        // menghitung jarak dari titik 1 ke titik 2
        RouteIndexOfPoint2 = findNearestPointIndex(costumerPos, route[0]);
        totalDistance += calcDistance(costumerPos, route[0][RouteIndexOfPoint2]);
        pointChar[1] = (char) (RouteIndexOfPoint2 + 65); // (char) 65 = 'A'
        // menghitung jarak dari titik 2 ke titik 3
        RouteIndexOfPoint3 = findNearestPointIndex(costumerPos, route[1]);
        totalDistance += calcDistance(route[0][RouteIndexOfPoint2], route[1][RouteIndexOfPoint3]);
        pointChar[2] = (char) (RouteIndexOfPoint3 + 65);
        // menghitung jarak dari titik 3 ke titik 4
        totalDistance += calcDistance(route[1][RouteIndexOfPoint3], destination);
        pointChar[3] = 'X';
    }

    static void output() {
        ;
    }

    static int findNearestPointIndex(double[] startingPoint, double[][] aimPoint) {
        // juga menghitung jarak total

        double dist, temp;
        int index;

        dist = calcDistance(startingPoint, aimPoint[0]);
        index = 0;
        for (int i = 0; i < aimPoint.length; i++) {
            temp = calcDistance(startingPoint, aimPoint[i]);
            if (temp < dist) {
                dist = temp;
                index = i;
            }
        }
        return index;
    }

    static double calcDistance(double[] point1, double[] point2) {
        return (Math.sqrt(Math.pow((point2[0] - point1[0]), 2) + Math.pow((point2[1] - point1[1]), 2)));
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
