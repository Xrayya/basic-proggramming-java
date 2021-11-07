package PrakPemdas.HR3;

import java.util.Scanner;

public class hadiahGiveaway {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        String usrname;

        usrname = io.next();
        io.close();

        if (usrname.charAt(0) == '@') {
            if ((usrname.length() - 1) % 2 == 1) {
                switch (usrname.toLowerCase().charAt(1)) {
                    case 'a':
                    case 'i':
                    case 'u':
                    case 'e':
                    case 'o':
                        System.out.println("Reward anda : E-Money");
                        break;
                    default:
                        System.out.println("Reward anda : Pulsa");
                        break;
                }
            } else {
                switch (usrname.toLowerCase().charAt(1)) {
                    case 'a':
                    case 'i':
                    case 'u':
                    case 'e':
                    case 'o':
                        System.out.println("Reward anda : Meet n Greet");
                        break;
                    default:
                        System.out.println("Reward anda : Smartphone");
                        break;
                }
            }
        } else {
            System.out.println("Username tidak valid");
        }
    }
}