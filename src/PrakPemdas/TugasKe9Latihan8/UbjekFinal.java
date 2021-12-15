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

    static int nearestDriverIndex;

    static char[] pointChar = new char[4];

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        header_app();
        input();
        process();
        output();
        footer();
    }

    static void input() {
        System.out.print("Masukkan nama penumpang\t\t\t\t\t: ");
        costumerName = in.nextLine();
        System.out.print(
            "Masukkan titik koordinat penumpang (x <spasi> y)\t: "
        );
        costumerPos[0] = in.nextDouble();
        costumerPos[1] = in.nextDouble();
        System.out.print("Masukkan titik koordinat tujuan (x <spasi> y)\t\t: ");
        destination[0] = in.nextDouble();
        destination[1] = in.nextDouble();

        inSectionSeparator();

        System.out.print("Masukkan banyak pengemudi yang tersedia\t\t\t: ");
        nDriver = in.nextInt();
        in.nextLine();
        driverName = new String[nDriver];
        driverPos = new double[nDriver][2];
        // dimensi kedua : index 0 = x; index 1 = y

        for (int i = 0; i < nDriver; i++) {
            System.out.printf("Masukkan nama pengemudi ke-%d\t\t\t\t: ", i + 1);
            driverName[i] = in.nextLine();
            System.out.printf(
                "Masukkan koordinat pengemudi ke-%d (x <spasi> y)\t\t: ",
                i + 1
            );
            driverPos[i][0] = in.nextDouble();
            driverPos[i][1] = in.nextDouble();
            in.nextLine();
        }

        inSectionSeparator();

        System.out.print("Masukkan banyak rute yang tersedia\t\t\t: ");
        nRoute = in.nextInt();
        route = new double[2][nRoute][2];
        // dimensi pertama = titik rute (titik 2 / 3); dimensi kedua = indeks rute; dimensi ketiga =  x / y
        // memudahkan saat pemanggilan method findNearestPointIndex

        for (int i = 0; i < nRoute; i++) {
            System.out.printf(
                "Masukkan koordinat rute %d titik 1 (x <spasi> y)\t\t: ",
                i + 1
            );
            route[0][i][0] = in.nextDouble();
            route[0][i][1] = in.nextDouble();
            System.out.printf(
                "Masukkan koordinat rute %d titik 2 (x <spasi> y)\t\t: ",
                i + 1
            );
            route[1][i][0] = in.nextDouble();
            route[1][i][1] = in.nextDouble();
        }
    }

    static void process() {
        int RouteIndexOfPoint2, RouteIndexOfPoint3;

        nearestDriverIndex = findNextNearestPointIndex(costumerPos, driverPos);

        pointChar[0] = 'P';

        // menghitung jarak dari titik 1 ke titik 2
        RouteIndexOfPoint2 = findNextNearestPointIndex(costumerPos, route[0]);
        pointChar[1] = (char) (65 + (RouteIndexOfPoint2) * 2); // (char) 65 = 'A'
        // menghitung jarak dari titik 2 ke titik 3
        RouteIndexOfPoint3 =
            findNextNearestPointIndex(route[0][RouteIndexOfPoint2], route[1]);
        pointChar[2] = (char) (66 + (RouteIndexOfPoint3) * 2);
        // menghitung jarak dari titik 3 ke titik 4
        pointChar[3] = 'X';
    }

    static void output() {
        double nearestDriverDist;

        header_output();

        nearestDriverDist =
            calcDistance(costumerPos, driverPos[nearestDriverIndex]);
        System.out.printf(
            "Pengemudi %s adalah yang terdekat dengan %s dengan jarak %.2f km\n",
            driverName[nearestDriverIndex],
            costumerName,
            nearestDriverDist
        );

        System.out.printf("Rute terdekat yang ditempuh: ");
        for (char c : pointChar) {
            if (c == 'X') {
                System.out.print(c);
            } else {
                System.out.printf("%c - ", c);
            }
        }
        System.out.println();
    }

    static int findNextNearestPointIndex(
        double[] startingPoint,
        double[][] aimPoint
    ) {
        double dist, temp;
        int index;

        dist = calcDistance(startingPoint, aimPoint[0]);
        index = 0;
        for (int i = 1; i < aimPoint.length; i++) {
            temp = calcDistance(startingPoint, aimPoint[i]);
            if (temp < dist) {
                dist = temp;
                index = i;
            }
        }
        return index;
    }

    static double calcDistance(double[] point1, double[] point2) {
        return (
            Math.sqrt(
                Math.pow((point2[0] - point1[0]), 2) +
                Math.pow((point2[1] - point1[1]), 2)
            )
        );
    }

    static void header_app() {
        System.out.println(
            "==========================================================================="
        );
        System.out.println(
            "                           PROGRAM UB-JEK FINAL                            "
        );
        System.out.println(
            "==========================================================================="
        );
    }

    static void header_output() {
        System.out.println(
            "==========================================================================="
        );
        System.out.println(
            "                             Hasil Perhitungan                             "
        );
        System.out.println(
            "---------------------------------------------------------------------------"
        );
    }

    static void footer() {
        System.out.println(
            "==========================================================================="
        );
        System.out.println(
            "                   copyright Praktikum Pemdas SI-B 2021                    "
        );
        System.out.println(
            "==========================================================================="
        );
    }

    static void inSectionSeparator() {
        System.out.println(
            "---------------------------------------------------------------------------"
        );
    }
}
