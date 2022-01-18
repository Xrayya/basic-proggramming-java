package Edabit;

public class TriangularNumSeq {
    public static void main(String[] args) {
        int res;

        res = triangle(1);
        System.out.println(res);

        res = triangle(6);
        System.out.println(res);

        res = triangle(215);
        System.out.println(res);
    }

    public static int triangle(int n) {
        if (n < 1) {
            return n;
        }

        return n + triangle(--n);
    }
}
