package Codingame;

import java.util.Scanner;

public class Player {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lx = in.nextInt();
        int ly = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();

        while (tx != lx && ty != ly) {
            in.nextInt();
            String dirx, diry;
            if (ty > ly) {
                diry = "N";
                ty--;
            } else if (ty < ly) {
                diry = "S";
                ty++;
            } else {
                diry = "";
            }

            if (tx > lx) {
                dirx = "W";
                tx--;
            } else if (tx < lx) {
                dirx = "E";
                tx++;
            } else {
                dirx = "";
            }

            System.out.println(diry + dirx);
        }
        in.close();
    }
}

// Code in python3
// lx,ly,tx,ty=[int(i) for i in input().split()]
// while True:
// input()
// if ty>ly:
// y="N"
// ty-=1
// elif ty<ly:
// y="S"
// ty+=1
// else:
// y=""
// if tx>lx:
// x="W"
// tx-=1
// elif tx<lx:
// x="E"
// tx+=1
// else:
// x=""
// print("%s%s"%(y,x))
