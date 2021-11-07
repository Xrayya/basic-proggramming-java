package PrakPemdas.HR6;

import java.util.Scanner;

public class remot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd;
        int channel, prevChannel, vol;

        if (in.next().equals("POWER"))
            System.out.println("TV ON");
        channel = 1;
        prevChannel = 1;
        vol = 50;

        cmd = in.next();
        while (!cmd.equals("POWER")) {
            switch (cmd) {
                case "CHANNEL":
                    if (in.hasNextInt()) {
                        prevChannel = channel;
                        channel = in.nextInt();

                        if (channel < 1 || channel > 30) {
                            channel = prevChannel;
                            System.out.println("Channel yang dimasukkan tidak valid");
                        } else {
                            System.out.println("Channel sekarang: " + channel);
                        }
                    } else if (in.hasNext())
                        switch (in.next()) {
                            case "UP":
                                if (channel == 30)
                                    System.out.println("Channel tidak valid");
                                else {
                                    prevChannel = channel;
                                    channel++;
                                    System.out.println("Channel sekarang: " + channel);
                                }
                                break;
                            case "DOWN":
                                if (channel == 1)
                                    System.out.println("Channel tidak valid");
                                else {
                                    prevChannel = channel;
                                    channel--;
                                    System.out.println("Channel sekarang: " + channel);
                                }
                                break;
                        }
                    break;
                case "PREV":
                    in.next();
                    channel = prevChannel;
                    System.out.println("Channel sekarang: " + channel);
                    break;
                case "VOLUME":
                    switch (in.next()) {
                        case "UP":
                            if (vol == 100)
                                System.out.println("Volume tidak valid");
                            else {
                                vol += 5;
                                System.out.println("Volume sekarang: " + vol);
                            }
                            break;
                        case "DOWN":
                            if (vol == 0)
                                System.out.println("Volume tidak valid");
                            else {
                                vol -= 5;
                                System.out.println("Volume sekarang: " + vol);
                            }
                            break;
                    }
                    break;
                case "MUTE":
                    System.out.println("Volume mute");
                    break;
                case "UNMUTE":
                    System.out.println("Volume sekarang: " + vol);
                    break;
            }
            cmd = in.next();
        }
        System.out.println("TV OFF");
        in.close();
    }
}