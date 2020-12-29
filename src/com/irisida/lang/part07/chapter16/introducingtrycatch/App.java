package com.irisida.lang.part07.chapter16.introducingtrycatch;

public class App {
    public static void main(String[] args) {

        /*
         * demos the ty/catch syntax
         */

        try {
            System.out.println("You know what else?");
            Thread.sleep(5000);
            System.out.println("...five seconds feels even longer still!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
