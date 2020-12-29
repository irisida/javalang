package com.irisida.lang.part07.chapter16.introducingexceptions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        /*
         * demo of the need for a throws InterruptedException if a try/catch block is
         * not used because a thread can be interrupted.
         */

        System.out.println("You know....");
        Thread.sleep(4000);
        System.out.println("...four seconds feels like a long time!");
    }
}
