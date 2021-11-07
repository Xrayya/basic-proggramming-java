package PrakPemdas.HR4;

import java.util.Scanner;

public class upinBerhitung2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int index;
        in.close();

        if (n == 0)
            System.out.print("nol");

        index = n / 100;
        switch (index) {
            case 1:
                System.out.print("seratus ");
                break;
            case 2:
                System.out.print("dua ratus ");
                break;
            case 3:
                System.out.print("tiga ratus ");
                break;
            case 4:
                System.out.print("empat ratus ");
                break;
            case 5:
                System.out.print("lima ratus ");
                break;
            case 6:
                System.out.print("enam ratus ");
                break;
            case 7:
                System.out.print("tujuh ratus ");
                break;
            case 8:
                System.out.print("delapan ratus ");
                break;
            case 9:
                System.out.print("sembilan ratus ");
                break;
            default:
                break;
        }

        n %= 100;
        index = n / 10;
        switch (index) {
            case 1:
                switch (n % 10) {
                    case 0:
                        System.out.print("sepuluh");
                        break;
                    case 1:
                        System.out.print("sebelas");
                        break;
                    case 2:
                        System.out.print("dua belas");
                        break;
                    case 3:
                        System.out.print("tiga belas");
                        break;
                    case 4:
                        System.out.print("empat belas");
                        break;
                    case 5:
                        System.out.print("lima belas");
                        break;
                    case 6:
                        System.out.print("enam belas");
                        break;
                    case 7:
                        System.out.print("tujuh belas");
                        break;
                    case 8:
                        System.out.print("delapan belas");
                        break;
                    case 9:
                        System.out.print("sembilan belas");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.print("dua puluh ");
                break;
            case 3:
                System.out.print("tiga puluh ");
                break;
            case 4:
                System.out.print("empat puluh ");
                break;
            case 5:
                System.out.print("lima puluh ");
                break;
            case 6:
                System.out.print("enam puluh ");
                break;
            case 7:
                System.out.print("tujuh puluh ");
                break;
            case 8:
                System.out.print("delapan puluh ");
                break;
            case 9:
                System.out.print("sembilan puluh ");
                break;
            default:
                break;
        }

        index = n % 10;
        if (n / 10 != 1)
            switch (index) {
                case 1:
                    System.out.print("satu");
                    break;
                case 2:
                    System.out.print("dua");
                    break;
                case 3:
                    System.out.print("tiga");
                    break;
                case 4:
                    System.out.print("empat");
                    break;
                case 5:
                    System.out.print("lima");
                    break;
                case 6:
                    System.out.print("enam");
                    break;
                case 7:
                    System.out.print("tujuh");
                    break;
                case 8:
                    System.out.print("delapan");
                    break;
                case 9:
                    System.out.print("sembilan");
                    break;
                default:
                    break;
            }
    }
}