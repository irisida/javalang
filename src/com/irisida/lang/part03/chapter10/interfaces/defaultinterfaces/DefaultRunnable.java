package com.irisida.lang.part03.chapter10.interfaces.defaultinterfaces;

public interface DefaultRunnable extends Runnable {
    default void displayDetails() {
        System.out.println("I am the default handling of displayDetails");
    }
}
