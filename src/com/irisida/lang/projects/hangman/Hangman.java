package com.irisida.lang.projects.hangman;

import java.util.Scanner;

public class Hangman {
    private boolean running = true;
    private RandomWord word = new RandomWord();
    private Scanner scanner = new Scanner(System.in);
    private int lives = 5;

    public void run() {
        do {
            displayWord();

            getUserInput();

            checkUserInput();
        } while (running);
    }

    public void displayWord() {
        // do something
        System.out.println(word);
        System.out.println("Number of lives remaining: " + lives);
    }

    public void getUserInput() {
        if (lives > 0) {
            System.out.print("Choose a letter: ");
            String guess = scanner.nextLine();

            if (!guess.isEmpty()) {
                /*
                 * call the updateState method with the character we are using as a guess.
                 */
                word.updateState(guess.charAt(0));
                if (word.isLifeLost()) {
                    lives--;
                }
            } else {
                System.out.println("Blank guesses lose a life.");
                lives--;
            }

        } else {
            System.out.println("Loser! - the word was " + word.getAnswerOnGameEnd());
            running = false;
        }
    }

    public void checkUserInput() {

        if (word.isAnswered()) {
            System.out.println("Winner! - the word was " + word.getAnswerOnGameEnd());
            running = false;
        }

    }

    public void close() {
        /*
         * faux destructor as per java best practice. Here we can clean up by closing
         * the scanner object we opened at the beginning to avoid memory leaks.
         */
        scanner.close();
    }
}
