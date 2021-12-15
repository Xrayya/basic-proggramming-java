package HRCoba2.FirstLevel;

import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int N = io.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, (N * i));
        }

        io.close();
    }
}
