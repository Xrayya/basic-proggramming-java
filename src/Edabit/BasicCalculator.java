package Edabit;

public class BasicCalculator {
    public static void main(String[] args) {
        int res;

        res = calculator(2, '+', 2);
        System.out.println(res);

        res = calculator(2, '*', 2);
        System.out.println(res);

        res = calculator(4, '/', 2);
        System.out.println(res);
    }

    public static int calculator(int num1, char operator, int num2) {
        int res = 0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
        }

        return res;
    }
}
