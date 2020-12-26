package com.irisida.lang.projects.rockpaperscissors.application;

import com.irisida.lang.projects.rockpaperscissors.game.Game;

public class App {

    /*
     * limitations of the example include: almost no error handling of userInput.
     * poor formatting of the round summary and game conclusion
     *
     */

    public static void main(String[] args) {
        new Game().run();
    }
}
