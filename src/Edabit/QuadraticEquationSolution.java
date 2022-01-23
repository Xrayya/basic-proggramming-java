package Edabit;

public class QuadraticEquationSolution {
    public static void main(String[] args) {
        int res;

        res = solutions(1, 0, -1);
        System.out.println(res);

        res = solutions(1, 0, 0);
        System.out.println(res);

        res = solutions(1, 0, 1);
        System.out.println(res);

        res = solutions(200, 420, 800);
        System.out.println(res);

        res = solutions(200, 420, -800);
        System.out.println(res);

        res = solutions(1000, 1000, 0);
        System.out.println(res);

        res = solutions(10000, 400, 4);
        System.out.println(res);
    }

    public static int solutions(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        return d > 0 ? 2 : d == 0 ? 1 : 0;
    }
}
