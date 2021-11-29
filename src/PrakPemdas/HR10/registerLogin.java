package PrakPemdas.HR10;

import java.util.Scanner;

public class registerLogin {
    static int MAX_SLOT = 5;

    static String[] usrname = new String[MAX_SLOT];
    static String[] pwd     = new String[MAX_SLOT];
    static String[] name    = new String[MAX_SLOT];

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    static void workflow() {
        menu();
    }

    static void menu() {
        int availSlot, beginIndex;
        availSlot = MAX_SLOT - emptyindex();

        System.out.printf("Slot akun = %d\n", availSlot);
        System.out.println("Daftar Perintah");
        if (availSlot == 0) {
            beginIndex = 1;
            System.out.printf("%d. Register", beginIndex);
        } else {
            beginIndex = 0;
        }
        System.out.printf("%d. Login", beginIndex + 1);
        System.out.printf("0. Berhenti");
        System.out.print("Masukkan perintah: ");
    }

    static void register() {
        ;
    }

    static void login() {
        ;
    }

    static int emptyindex() {
        int i = 0;
        while (i < MAX_SLOT) {
            if (pwd[i] == null) {
                break;
            }
            i++;
        }
        return i;
    }
}
