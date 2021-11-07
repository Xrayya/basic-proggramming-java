package PrakPemdas.HR5;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String op;
        double num, result;

        result = 0;
        op = in.next();
        while (!op.equals("SELESAI")) {

            switch (op) {
                case "TAMBAH":
                    num = in.nextDouble();
                    result += num;
                    break;
                case "KURANG":
                    num = in.nextDouble();
                    result -= num;
                    break;
                case "KALI":
                    num = in.nextDouble();
                    result *= num;
                    break;
                case "BAGI":
                    num = in.nextDouble();
                    if (num == 0)
                        result = 0;
                    else
                        result /= num;
                    break;
                default:
                    in.nextLine();
            }
            System.out.println(result);

            op = in.next();
        }
        in.close();

        System.out.println(result);
    }
}