package rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public String drawChoice(int number) {

        ArrayList<String> choiceList = new ArrayList<>();

        choiceList.add("ROCK");
        choiceList.add("PAPER");
        choiceList.add("SCISSORS");

        return choiceList.get(number-1);
    }

    public void playGame() {

        boolean end = false;
        while (!end) {

            int playerWINS = 0;
            int computerWINS = 0;
            System.out.println("Give number of rounds followed by a victory");
            Scanner s = new Scanner(System.in);

            int rounds = s.nextInt();
            System.out.println("PRESS [1] FOR ROCK, [2] FOR PAPER, OR [3] FOR SCISSORS");

            while (playerWINS != rounds && computerWINS != rounds) {

                int playerChoice;
                Scanner sc = new Scanner(System.in);
                playerChoice = sc.nextInt();

                int computerChoice;
                Random random = new Random();
                computerChoice = random.nextInt(3) + 1;

                if (playerChoice == computerChoice) {
                    System.out.println("PLAYER CHOICE IS " + drawChoice(playerChoice));
                    System.out.println("COMPUTER CHOICE IS " + drawChoice(computerChoice));
                    System.out.println("Remiss");
                }

                if (playerChoice != computerChoice) {

                    if (whoWon(playerChoice, computerChoice)) {
                        playerWINS++;
                    }

                    if (!whoWon(playerChoice, computerChoice)) {
                        computerWINS++;

                    }
                }
                System.out.println(playerWINS);
                System.out.println(computerWINS);
            }

            System.out.println("Would you like play again? PRESS [n] - PLAY or [x] - EXIT");
            Scanner sc = new Scanner(System.in);
            char exit = 'x';
            char play = 'n';

            char playOrNot = sc.next().charAt(0);
            while (playOrNot != 'x' && playOrNot != 'n') {

                System.out.println("WRONG SELECTION, PRESS [n] TO PLAY OR [x] TO EXIT");
                playOrNot = sc.next().charAt(0);
            }

            if (exit == playOrNot) {
                end = true;
            }
            if (play == playOrNot) {
                playGame();
            }

        }
    }

        public boolean whoWon ( int player, int computer){

            System.out.println("PLAYER CHOICE IS " +drawChoice(player));
            System.out.println("COMPUTER CHOICE IS " + drawChoice(computer));

            if ((player == 1 && computer == 2) || (player == 2 && computer == 3) || (player == 3 && computer == 1)) {
                System.out.println("COMPUTER WON!!!");
                return false;
            }

            System.out.println("PLAYER WON!!!");
            return true;
        }
    }

class Main {
    public static void main(String args[]) {
        RpsRunner rps = new RpsRunner();
        rps.playGame();

    }
}