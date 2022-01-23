package Edabit;

public class ManyOperators {
    public static void main(String[] args) {
        int res;

        res = operate(1, 2, "+");
        System.out.println(res);

        res = operate(7, 10, "-");
        System.out.println(res);

        res = operate(20, 10, "%");
        System.out.println(res);

        res = operate(1, 1, "+");
        System.out.println(res);

        res = operate(1, 1, "-");
        System.out.println(res);

        res = operate(1, 1, "*");
        System.out.println(res);

        res = operate(1, 1, "/");
        System.out.println(res);

        res = operate(1, 1, "%");
        System.out.println(res);

        res = operate(2, 1, "+");
        System.out.println(res);

        res = operate(2, 1, "-");
        System.out.println(res);

        res = operate(2, 1, "*");
        System.out.println(res);

        res = operate(2, 1, "/");
        System.out.println(res);

        res = operate(2, 1, "%");
        System.out.println(res);

        res = operate(1234, -1234, "-");
        System.out.println(res);
    }

    public static int operate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                return 0;
        }
    }
}
