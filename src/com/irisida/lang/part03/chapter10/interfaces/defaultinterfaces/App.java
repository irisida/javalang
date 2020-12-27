package com.irisida.lang.part03.chapter10.interfaces.defaultinterfaces;

public class App {
    public static void main(String[] args) {

        DefaultRunnable m1 = new Machine();

        m1.run(); // runs the implementation in the class
        m1.displayDetails(); // runs the default handler defined in the interface
    }
}
