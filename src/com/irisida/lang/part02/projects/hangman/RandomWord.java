package com.irisida.lang.part02.projects.hangman;

import java.util.Random;

public class RandomWord {
    // attributes
    private Random random = new Random();
    private char[] characters;
    private String selectedWord;
    private boolean lifeLost = true;
    private String[] words = { "earth", "abhorrent", "invent", "daughter", "vessel", "thinkable", "moan", "lamentable",
            "gusty", "efficient", "applaud", "digestion", "naughty", "quizzical", "grandmother", "rural", "bedroom",
            "prevent", "purple", "zoom" };

    public RandomWord() {
        selectedWord = words[random.nextInt(words.length)];
        characters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder word = new StringBuilder();

        for (char c : characters) {
            /*
             * if the value of 'c' is a null then we add the placeholder, if we have a value
             * for 'c' we add the value. Using ternary as a little bit of noise reduction in
             * the code which has, ironically enough, been added back by the size of the
             * comment.
             */
            word.append(c == '\u0000' ? '_' : c);
            word.append(' ');
        }
        System.out.println(); // print an empty line.

        return word.toString();
    }

    public void updateState(char guessCharacter) {
        /*
         * fill-in the characters array with letters matching the selectedWord note the
         * use of .chatAt to get a character from a string value and that it requires
         * the index position.
         */
        lifeLost = true;

        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == guessCharacter) {
                characters[i] = guessCharacter;
                lifeLost = false;
            }
        }

    }

    public boolean isLifeLost() {
        return lifeLost;
    }

    public boolean isAnswered() {
        for (char c : characters) {
            if (c == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public String getAnswerOnGameEnd() {
        return selectedWord;
    }
}
