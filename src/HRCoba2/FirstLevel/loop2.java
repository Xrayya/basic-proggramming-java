package HRCoba2.FirstLevel;

import java.util.Scanner;

public class loop2 {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int q, a, b, n, result;

        q = io.nextInt();
        for (int i = 1; i <= q; i++) {
            a = io.nextInt();
            b = io.nextInt();
            n = io.nextInt();

            result = a;
            for (int j = 0; j < n; j++) {
                result += (int) Math.pow(2, j) * b;
                System.out.printf("%d ", result);
            }

            result = 0;
            System.out.println();
        }

        io.close();
    }
}
