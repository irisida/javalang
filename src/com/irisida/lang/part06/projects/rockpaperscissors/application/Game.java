package com.irisida.lang.part06.projects.rockpaperscissors.application;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int playerScore = 0;
    private int cpuScore = 0;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void run() {

        for (int i = 0; i < 3; i++) {
            GameObject cpuPlayer = pickObject();
            GameObject player1 = getPlayerObject();

            System.out.printf("%s Vs %s%n", player1, cpuPlayer);

            // get the comparison value (determines winner/loser)
            boolean winResult = player1.beats(cpuPlayer);
            boolean loseResult = player1.losesTo(cpuPlayer);

            if (winResult) {
                System.out.println("player wins!");
                playerScore++;
            } else if (loseResult) {
                System.out.println("CPU wins!");
                cpuScore++;
            }
        }

        // show the final scores
        System.out.printf("Player %d : %d CPU %n", playerScore, cpuScore);
    }

    public GameObject getPlayerObject() {
        do {
            System.out.print("Enter your choice: 1. Rock, 2. Paper, 3. Scissors >> ");
            int input = scanner.nextInt();
            if (input > 0 && input <= 3) {
                GameObject[] objects = GameObject.values();
                return objects[input - 1];
            }
        } while (true);
    }

    private GameObject pickObject() {
        GameObject[] objects = GameObject.values();
        return objects[random.nextInt(objects.length)];
    }
}
