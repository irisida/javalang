package com.irisida.lang.projects.hangman;

public class App {
    public static void main(String[] args) {

        // create a new game
        Hangman game = new Hangman();

        // run
        game.run();
        game.close();

    }
}
