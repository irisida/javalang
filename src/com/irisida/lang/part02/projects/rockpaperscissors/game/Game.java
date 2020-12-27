package com.irisida.lang.part02.projects.rockpaperscissors.game;

import java.util.Random;
import java.util.Scanner;

import com.irisida.lang.part02.projects.rockpaperscissors.game.gameobjects.GameObject;
import com.irisida.lang.part02.projects.rockpaperscissors.game.gameobjects.Paper;
import com.irisida.lang.part02.projects.rockpaperscissors.game.gameobjects.Rock;
import com.irisida.lang.part02.projects.rockpaperscissors.game.gameobjects.Scissors;

public class Game {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private static final GameObject[] GAME_OBJECTS = { new Rock(), new Paper(), new Scissors() };
    GameObject[] options = GAME_OBJECTS;
    private boolean running = true;

    private int getUserChoice() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enter your selection: ").append("\n");
        sb.append("  1. Rock").append("\n");
        sb.append("  2. Paper").append("\n");
        sb.append("  3. Scissors").append("\n");
        sb.append("  4. Exit").append("\n\n");
        sb.append("  >> ");

        System.out.print(sb.toString());
        return scanner.nextInt();
    }

    public void run() {
        int playerScore = 0;
        int cpuScore = 0;
        String cpuHeader = "{CPU}   , ";
        String playerHeader = "{Player}, ";

        do {
            int selection = getUserChoice();

            if (selection < 4) {
                GameObject cpuPlayer = options[random.nextInt(options.length)];
                GameObject player1 = options[selection - 1];

                switch (player1.compareTo(cpuPlayer)) {
                    case 0:
                        System.out.println("It was a draw");
                        System.out.println(cpuHeader + cpuPlayer);
                        System.out.println(playerHeader + player1);
                        break;
                    case 1:
                        System.out.println("You Win!");
                        playerScore++;
                        System.out.println(cpuHeader + cpuPlayer);
                        System.out.println(playerHeader + player1);
                        break;
                    default:
                        System.out.println("You lose!");
                        cpuScore++;
                        System.out.println(cpuHeader + cpuPlayer);
                        System.out.println(playerHeader + player1);
                }

            } else {
                running = false;
                System.out.println("Bye!");
            }

            if (playerScore == 5) {
                System.out.println("Victory!");
                running = false;
            } else if (cpuScore == 5) {
                System.out.println("Defeat - The battle was lost!");
                running = false;
            }

        } while (running);

    }
}
