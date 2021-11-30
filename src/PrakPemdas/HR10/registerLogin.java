package PrakPemdas.HR10;

import java.util.Scanner;

public class registerLogin {
    static int MAX_SLOT = 5;

    static String[] username = new String[MAX_SLOT];
    static String[] password = new String[MAX_SLOT];
    static String[] name     = new String[MAX_SLOT];
    static int availSlot;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        workflow();
    }

    static void workflow() {
        String cmd;

        do {
            availSlot = MAX_SLOT - findEmptyindex();
            menu();
            cmd = in.nextLine();
                switch (cmd) {
                    case "1":
                        if (availSlot != 0) {
                            register();
                        } else {
                            login();
                        }
                        break;
                    case "2":
                        if (availSlot != 0) {
                            login();
                        }
                        break;
                    default:
                        break;
                }
        } while (!cmd.equals("0"));
    }

    static void menu() {
        int beginIndex;

        System.out.printf("Slot akun = %d\n", availSlot);
        System.out.println("Daftar Perintah");
        if (availSlot != 0) {
            beginIndex = 1;
            System.out.printf("%d. Register\n", beginIndex);
        } else {
            beginIndex = 0;
        }
        System.out.printf("%d. Login\n", beginIndex + 1);
        System.out.printf("0. Berhenti\n");
        System.out.println("Masukkan perintah: ");
    }

    static void register() {
        int emptyIndex = findEmptyindex();

        System.out.println("Masukkan username: ");
        username[emptyIndex] = in.nextLine();
        System.out.println("Masukkan password: ");
        password[emptyIndex] = in.nextLine();
        System.out.println("Masukkan nama: ");
        name[emptyIndex] = in.nextLine();
    }

    static void login() {
        String usrname, pwd;
        int usrIndex;
        boolean usrnameExist, pwdMatch;

        if (availSlot == 5) {
            System.out.println("Belum ada akun!");
        } else {
            do {
                System.out.println("Masukkan username: ");
                usrname = in.nextLine();
                System.out.println("Masukkan password: ");
                pwd = in.nextLine();

                usrIndex = findUsernameIndex(usrname);
                if (usrIndex == MAX_SLOT) {
                    usrnameExist = false;
                    pwdMatch = false;
                } else {
                    usrnameExist = true;
                    if (pwd.equals(password[usrIndex])) {
                        pwdMatch = true;
                    } else {
                        pwdMatch = false;
                    }
                }

                if (!usrnameExist) {
                    System.out.println("Username Salah!");
                } else {
                    if (!pwdMatch) {
                        System.out.println("Password Salah!");
                    }
                }

                if (usrnameExist && pwdMatch) {
                    System.out.printf("Username: %s\n", username[usrIndex]);
                    System.out.printf("Nama: %s\n", name[usrIndex]);
                }
            } while (!usrnameExist || !pwdMatch);
        }
    }

    static int findEmptyindex() {
        int i = 0;
        while (i < MAX_SLOT) {
            if (password[i] == null) {
                break;
            }
            i++;
        }
        return i;
    }

    static int findUsernameIndex(String usrname) {
        int i = 0;
        while (i < MAX_SLOT) {
            if (usrname.equals(username[i])) {
                break;
            }
            i++;
        }
        return i;
    }
}
