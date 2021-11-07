package PrakPemdas;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // int num[] = new int[10];

        // for (int i = 0, j = 10; i < 10; i++, j--) {
        // num[i] = j;
        // }

        // try {
        // int x = in.nextInt();
        // System.out.println(num[x]);
        // } catch (Exception e) {
        // System.out.println("Finish");
        // }
        // in.close();

        Scanner io = new Scanner(System.in);
        String pwr, perintah1, perintah2;
        int chnl, vol, number, prev;

        pwr = io.nextLine();
        if (pwr.equals("POWER")) {
            chnl = 1;
            vol = 50;
            number = 0;
            prev = 1;
            System.out.println("TV ON");
            do {
                perintah1 = io.next();
                if (perintah1.equals("CHANNEL")) {
                    prev = chnl;
                    perintah2 = io.next();
                    if (perintah2.equals("UP")) {
                        chnl++;
                        if (chnl > 30) {
                            System.out.println("Channel tidak valid");
                            chnl--;
                        } else {
                            System.out.println("Channel sekarang: " + chnl);
                        }
                    } else if (perintah2.equals("DOWN")) {
                        chnl--;
                        if (chnl < 1) {
                            System.out.println("Channel tidak valid");
                            chnl++;
                        } else {
                            System.out.println("Channel sekarang: " + chnl);
                        }
                    } else {
                        number = Integer.parseInt(perintah2);
                        if (number < 1 || number > 30) {
                            System.out.println("Channel yang dimasukkan tidak valid");
                        } else {
                            chnl = number;
                            System.out.println("Channel sekarang: " + chnl);
                        }
                    }

                } else if (perintah1.equals("VOLUME")) {
                    perintah2 = io.next();
                    if (perintah2.equals("UP")) {
                        vol += 5;
                        if (vol > 100) {
                            System.out.println("Volume tidak valid");
                            vol -= 5;
                        } else {
                            System.out.println("Volume sekarang: " + vol);
                        }
                    } else if (perintah2.equals("DOWN")) {
                        vol -= 5;
                        if (vol < 0) {
                            System.out.println("Volume tidak valid");
                            vol += 5;
                        } else {
                            System.out.println("Volume sekarang: " + vol);
                        }
                    }
                } else if (perintah1.equals("PREV")) {
                    perintah2 = io.next();
                    chnl = prev;
                    System.out.println("Channel sekarang: " + chnl);
                } else if (perintah1.equals("MUTE")) {
                    System.out.println("Volume mute");
                } else if (perintah1.equals("UNMUTE")) {
                    System.out.println("Volume sekarang: " + vol);
                } else if (perintah1.equals("POWER")) {
                    System.out.println("TV OFF");
                    break;
                }

            } while (true);

        }
        io.close();
    }
}