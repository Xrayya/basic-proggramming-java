package HRCoba2.FirstLevel;

import java.util.Scanner;

public class staticInitializerBlock {

    public static void area(int b, int h) {
        if (b > 0 && h > 0) {
            System.out.println(b * h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int breadth, height;

        breadth = io.nextInt();
        height = io.nextInt();

        area(breadth, height);

        io.close();
    }
}