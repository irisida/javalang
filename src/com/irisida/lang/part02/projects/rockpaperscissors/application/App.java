package com.irisida.lang.part02.projects.rockpaperscissors.application;

import com.irisida.lang.part02.projects.rockpaperscissors.game.Game;

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
