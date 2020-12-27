package com.irisida.lang.part03.chapter10.projects.combined;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new ShortGreet(), 0L, 1000L);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new LongGreet(), 0L, 1L, TimeUnit.SECONDS);
    }
}
