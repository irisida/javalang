package com.irisida.lang.part03.chapter10.projects.timerproject;

import java.util.Timer;

public class App {
    public static void main(String[] args) {

        /*
         * creates a timer with zero delay before starting and a period between
         * executions of 1 second.
         */

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
    }
}
