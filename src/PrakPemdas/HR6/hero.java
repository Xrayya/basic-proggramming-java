package PrakPemdas.HR6;

import java.util.Scanner;

public class hero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lvlHero, lvlMonster, expHero, atkHero, healthHero, atkMonster, healthMonster, expMonster;
        String action;

        System.out.println("Masukkan level Hero: ");
        lvlHero = in.nextInt();
        System.out.println("Adventure Begins!");

        healthHero = 10 + lvlHero * 2;
        atkHero = 5 + lvlHero;
        expHero = 0;

        do {
            System.out.println("Monster muncul dengan level: ");
            lvlMonster = in.nextInt();

            atkMonster = 5 + lvlMonster;
            healthMonster = 10 + lvlMonster;
            expMonster = 3 * lvlMonster;

            System.out.println("Status Monster");
            System.out.println("Level: " + lvlMonster);
            System.out.println("Health Monster: " + healthMonster);
            System.out.println("Attack Monster: " + atkMonster);

            System.out.println(
                "Apa yang akan Hero lakukan? Lawan atau Pulang? "
            );
            action = in.next();

            if (action.equals("Lawan")) {
                while (true) {
                    healthMonster -= atkHero;
                    System.out.println(
                        "Hero menghajar Monster! Health Monster sisa: " +
                        healthMonster
                    );
                    if (healthMonster <= 0) {
                        System.out.println("Monster terkalahkan!");
                        expHero += expMonster;
                        if (expHero >= 20) {
                            lvlHero++;
                            System.out.println(
                                "Hero Level UP! Level Hero: " + lvlHero
                            );
                            healthHero = 10 + lvlHero * 2;
                            atkHero = 5 + lvlHero;
                            expHero = 0;
                        } else {
                            System.out.println(
                                "EXP Hero menuju Level UP: " + (20 - expHero)
                            );
                        }
                        break;
                    }
                    healthHero -= atkMonster;
                    System.out.println(
                        "Monster menghajar Hero! Health Hero sisa: " +
                        healthHero
                    );
                    if (healthHero <= 0) {
                        System.out.println(
                            "Hero kalah! Hero akan kembali ke resting place."
                        );
                        break;
                    }
                }
            } else if (action.equals("Pulang")) {
                System.out.println("Hero pulang!");
                System.out.println("Level Hero: " + lvlHero);
            }
        } while (!action.equals("Pulang") && healthHero > 0);
        System.out.println("Pertualangan Selesai");
        in.close();
    }
}
