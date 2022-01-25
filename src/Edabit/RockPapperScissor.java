package Edabit;

public class RockPapperScissor {
    public static void main(String[] args) {
        String res;

        res = rps("rock", "paper");
        System.out.println(res);

        res = rps("paper", "rock");
        System.out.println(res);

        res = rps("paper", "scissors");
        System.out.println(res);

        res = rps("scissors", "scissors");
        System.out.println(res);

        res = rps("scissors", "paper");
        System.out.println(res);

        res = rps("rock", "paper");
        System.out.println(res);

        res = rps("paper", "rock");
        System.out.println(res);

        res = rps("paper", "scissors");
        System.out.println(res);

        res = rps("scissors", "scissors");
        System.out.println(res);

        res = rps("scissors", "paper");
        System.out.println(res);
    }

    public static String rps(String s1, String s2) {
        String res = "";
        switch (s1) {
            case "rock":
                switch (s2) {
                    case "rock":
                        res = "TIE";
                        break;
                    case "paper":
                        res = "Player 2 wins";
                        break;
                    case "scissors":
                        res = "Player 1 wins";
                        break;
                }
                break;
            case "paper":
                switch (s2) {
                    case "rock":
                        res = "Player 1 wins";
                        break;
                    case "paper":
                        res = "TIE";
                        break;
                    case "scissors":
                        res = "Player 2 wins";
                        break;
                }
                break;
            case "scissors":
                switch (s2) {
                    case "rock":
                        res = "Player 2 wins";
                        break;
                    case "paper":
                        res = "Player 1 wins";
                        break;
                    case "scissors":
                        res = "TIE";
                        break;
                }
        }
        return res;
    }

}
