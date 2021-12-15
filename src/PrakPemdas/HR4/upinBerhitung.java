package PrakPemdas.HR4;

import java.util.Scanner;

public class upinBerhitung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        byte index;
        in.close();

        if (n.length() == 3) {
            switch (n.charAt(0)) {
                case '1':
                    System.out.print("seratus ");
                    break;
                case '2':
                    System.out.print("dua ratus ");
                    break;
                case '3':
                    System.out.print("tiga ratus ");
                    break;
                case '4':
                    System.out.print("empat ratus ");
                    break;
                case '5':
                    System.out.print("lima ratus ");
                    break;
                case '6':
                    System.out.print("enam ratus ");
                    break;
                case '7':
                    System.out.print("tujuh ratus ");
                    break;
                case '8':
                    System.out.print("delapan ratus ");
                    break;
                case '9':
                    System.out.print("sembilan ratus ");
                    break;
                default:
                    break;
            }
        }
        if (n.length() >= 2) {
            if (n.length() == 3) {
                index = 1;
            } else {
                index = 0;
            }
            switch (n.charAt(index)) {
                case '0':
                    if (n.charAt(++index) == '1') System.out.print("satu");
                    break;
                case '1':
                    switch (n.charAt(++index)) {
                        case '0':
                            System.out.print("sepuluh");
                            break;
                        case '1':
                            System.out.print("sebelas");
                            break;
                        default:
                            break;
                    }
                    break;
                case '2':
                    System.out.print("dua puluh ");
                    break;
                case '3':
                    System.out.print("tiga puluh ");
                    break;
                case '4':
                    System.out.print("empat puluh ");
                    break;
                case '5':
                    System.out.print("lima puluh ");
                    break;
                case '6':
                    System.out.print("enam puluh ");
                    break;
                case '7':
                    System.out.print("tujuh puluh ");
                    break;
                case '8':
                    System.out.print("delapan puluh ");
                    break;
                case '9':
                    System.out.print("sembilan puluh ");
                    break;
                default:
                    break;
            }
        }
        if (n.length() >= 1) {
            if (n.length() == 3) {
                index = 2;
            } else if (n.length() == 2) {
                index = 1;
            } else {
                index = 0;
            }
            switch (n.charAt(index)) {
                case '0':
                    if (index == 0) System.out.print("nol");
                    break;
                case '1':
                    if (index == 0) System.out.print("satu");
                    break;
                case '2':
                    System.out.print("dua");
                    break;
                case '3':
                    System.out.print("tiga");
                    break;
                case '4':
                    System.out.print("empat");
                    break;
                case '5':
                    System.out.print("lima");
                    break;
                case '6':
                    System.out.print("enam");
                    break;
                case '7':
                    System.out.print("tujuh");
                    break;
                case '8':
                    System.out.print("delapan");
                    break;
                case '9':
                    System.out.print("sembilan");
                    break;
                default:
                    break;
            }
        }
    }
}
