package com.irisida.lang.part05.chapter13.innerclassexample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    private String appName;

    public App() {
        appName = "innerClassApp";
    }

    public void run() {
        // inner class
        class PrinterClass implements Runnable {
            public void print() {
                /*
                 * note we're required to name the outer class here in order for the this
                 * keyword to be interpreted correctly.
                 */
                System.out.println(App.this.appName);
            }

            @Override
            public void run() {
                print();
            }
        }

        /*
         * creates a timer using the concurrent package Executors. W then create a new
         * PrinterClass object is created and run every second.
         */
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new PrinterClass(), 0, 1L, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        new App().run();
    }

}
