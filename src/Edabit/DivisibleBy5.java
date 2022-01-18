package Edabit;

public class DivisibleBy5 {
    public static void main(String[] args) {
        boolean res;

        res = divisibleByFive(5);
        System.out.println(res);
        res = divisibleByFive(-55);
        System.out.println(res);
        res = divisibleByFive(37);
        System.out.println(res);
    }

    public static boolean divisibleByFive(int num) {
        return num % 5 == 0 ? true : false;
    }
}
