package com.irisida.lang.part03.chapter10.projects.interfaceproject;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        //
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleAtFixedRate(new Task(), 0L, 1L, TimeUnit.SECONDS);
    }
}
