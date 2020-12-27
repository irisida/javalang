package com.irisida.lang.part03.chapter10.projects.eggtimer;

public class Completed implements Runnable {
    int count = 0;

    @Override
    public void run() {
        if (count == 60) {
            System.out.println("It's been 1 minute!");
        } else if (count % 60 == 0) {
            System.out.printf("It's been %d minutes!%n", count / 60);
        }
        count++;

    }
}
