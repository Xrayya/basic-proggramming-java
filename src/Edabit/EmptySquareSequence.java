package Edabit;

public class EmptySquareSequence {
    public static void main(String[] args) {
        int res;

        res = emptySq(1);
        System.out.println(res);

        res = emptySq(3);
        System.out.println(res);

        res = emptySq(10);
        System.out.println(res);

        res = emptySq(27);
        System.out.println(res);

        res = emptySq(0);
        System.out.println(res);

        res = emptySq(19);
        System.out.println(res);

        res = emptySq(60);
        System.out.println(res);

        res = emptySq(7);
        System.out.println(res);

    }

    public static int emptySq(int step) {
        if (step == 0) {
            return 0;
        }

        return 8 * (step - 1) + emptySq(step - 1);
    }
}
