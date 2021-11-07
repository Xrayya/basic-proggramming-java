package HRCoba2.FirstLevel;

import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int i = 0;
        while (io.hasNext()) {
            System.out.println(++i + " " + io.nextLine());
        }

        io.close();
    }
}