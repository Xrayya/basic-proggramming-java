package Edabit;

public class SumOfPoligonAngles {
    public static void main(String[] args) {
        int res;

        res = sumOfAngles(3);
        System.out.println(res);
        res = sumOfAngles(4);
        System.out.println(res);
        res = sumOfAngles(6);
        System.out.println(res);
    }

    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }
}
