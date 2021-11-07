package HRCoba2.FirstLevel;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int num;
        String s;

        num = io.nextInt();

        s = Integer.toString(num);

        if (Integer.parseInt(s) == num) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        io.close();
    }
}