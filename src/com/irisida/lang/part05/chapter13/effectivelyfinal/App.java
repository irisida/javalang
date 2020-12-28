package com.irisida.lang.part05.chapter13.effectivelyfinal;

public class App {
    private int count = 0;

    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        String classNameAsString = "App"; // effectively final means that this is accessible from within the inner class
                                          // but is not mutable. So, even though we have not defined it as a final it is
                                          // effectively treated as a final.

        class InnerClass {

            public void printMethod() {
                System.out.printf("Class: %s  has count: %d %n", classNameAsString, count);
            }
        }

        new InnerClass().printMethod();
    }
}
