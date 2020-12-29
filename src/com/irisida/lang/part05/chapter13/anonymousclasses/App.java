package com.irisida.lang.part05.chapter13.anonymousclasses;

public class App {
    private String name = "Swiss Tony";

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {
        /*
         * calls activate with a new Runnable. opening the brackets and implementing the
         * run method makes this an anonymous class.
         */
        activate(new Runnable() {
            @Override
            public void run() {
                System.out.printf("name: %s%n", name);
            }
        });
    }

    public void activate(Runnable runnable) {
        runnable.run();
    }
}
