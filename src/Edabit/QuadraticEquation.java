package Edabit;

public class QuadraticEquation {
    public static void main(String[] args) {
        int res;

        res = quadraticEquation(1, 2, -3);
        System.out.println(res);

        res = quadraticEquation(2, -7, 3);
        System.out.println(res);

        res = quadraticEquation(1, -12, -28);
        System.out.println(res);
    }

    public static int quadraticEquation(int a, int b, int c) {
        return (-b + (int) Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
