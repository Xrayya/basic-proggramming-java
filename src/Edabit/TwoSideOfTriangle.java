package Edabit;

public class TwoSideOfTriangle {
    public static void main(String[] args) {
        double[] res;

        res = otherSides(1);
        System.out.printf("[%.2f, %.2f]\n", res[0], res[1]);

        res = otherSides(12);
        System.out.printf("[%.2f, %.2f]\n", res[0], res[1]);

        res = otherSides(2);
        System.out.printf("[%.2f, %.2f]\n", res[0], res[1]);

        res = otherSides(3);
        System.out.printf("[%.2f, %.2f]\n", res[0], res[1]);
    }

    public static double[] otherSides(int n) {
        return new double[] { n * 2.0, n * Math.sqrt(3) };
    }
}
