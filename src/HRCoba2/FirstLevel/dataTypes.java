package HRCoba2.FirstLevel;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int t;
        long num;

        t = io.nextInt();

        for (int j = 1; j <= t; j++) {

            try {
                num = io.nextLong();

                System.out.println(num + " can be fitted in:");

                if (num >= -Math.pow(2, 7) && num <= Math.pow(2, 7) - 1)
                    System.out.println("* byte");
                if (num >= -Math.pow(2, 15) && num <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (num >= -Math.pow(2, 31) && num <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (num >= -Math.pow(2, 63) && num <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(io.next() + " can't be fitted anywhere.");
            }
        }

        io.close();
    }
}