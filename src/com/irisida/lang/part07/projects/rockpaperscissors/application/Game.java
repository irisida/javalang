package com.irisida.lang.part07.projects.rockpaperscissors.application;

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
        GameObject[] objects = GameObject.values();
        GameObject myObject = null;
        boolean receivedNumber = false;
        int index = 0;

        do {
            System.out.print("Enter your choice: 1. Rock, 2. Paper, 3. Scissors >> ");
            String input = scanner.nextLine();

            try {
                index = Integer.parseInt(input);

                if (index > 0 && index <= 3) {
                    myObject = objects[index - 1];
                    receivedNumber = true;
                } else {
                    System.out.println("Number must be 1, 2 or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! ");
            }
        } while (!receivedNumber);

        return myObject;
    }

    private GameObject pickObject() {
        GameObject[] objects = GameObject.values();
        return objects[random.nextInt(objects.length)];
    }
}
