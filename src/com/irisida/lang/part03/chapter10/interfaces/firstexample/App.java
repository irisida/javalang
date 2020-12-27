package com.irisida.lang.part03.chapter10.interfaces.firstexample;

public class App {
    public static void main(String[] args) {
        /*
         * Example that demonstrates the use of interfaces for grouping seemingly
         * unrelated objects or types.
         */

        Describable[] objs = { new Computer(), new Person(), new Computer(), new Computer() };

        for (Describable d : objs) {
            System.out.println(d.getDescription());
        }

    }
}
