package com.irisida.lang.part03.chapter10.projects.eggtimer;

import java.util.TimerTask;

public class IntervalCounter extends TimerTask {
    int count = 0;

    @Override
    public void run() {

        if (count % 10 == 0 && count % 60 != 0) {
            System.out.printf("It's been a %d seconds!%n", count);
        }
        count++;

    }
}
