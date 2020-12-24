package com.irisida.lang.projects.bingo;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int[] called = new int[50];
    private boolean running = true;

    public void startGame() {
        /*
         * setup player 1
         */
        System.out.print("Player 1 name: ");
        String pName = scanner.nextLine();

        Player p1 = new Player(pName);
        System.out.println(p1);

        /*
         * setup player 2
         */
        System.out.print("Player 2 name: ");
        pName = scanner.nextLine();

        Player p2 = new Player(pName);
        System.out.println(p2);

        int calledIndex = 0;
        do {
            /*
             * Generate a new number using the random package. Check if the new number
             * generated is already present in the list of numbers called to prevent
             * duplicates. Add each new number to the list.
             */
            int nextNumber = random.nextInt(51);
            boolean matched = false;

            for (int i = 0; i < called.length; i++) {
                if (nextNumber == called[i]) {
                    matched = true;
                }
            }

            if (!matched) {
                called[calledIndex] = nextNumber;
            }

            /*
             * update the player card to mark off the numbers that appear in the players
             * card that have been called (came up in random selection).
             */
            p1.getCard().markOffNumber(nextNumber);
            p2.getCard().markOffNumber(nextNumber);

            boolean p1Claim = p1.getCard().isComplete();
            boolean p2Claim = p2.getCard().isComplete();

            /*
             * handle the cases where the checks to isComplete have identified we have a
             * winner, or a draw.
             */
            if (p1Claim && p2Claim) {
                System.out.println("Draw!");
                running = false;
            } else if (p1Claim && !p2Claim) {
                System.out.println(p1.getName() + " is the Winner!");
                running = false;
            } else if (!p1Claim && p2Claim) {
                System.out.println(p2.getName() + " is the Winner!");
                running = false;
            }

        } while (running);

        System.out.println(p1.getCard().toString());
        System.out.println(p2.getCard().toString());

    }

    public void endGame() {
        scanner.close();
    }
}
