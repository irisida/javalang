package com.irisida.lang.part05.chapter13.sectionsummary;

public class App implements Runnable {
    private String name = "Swiss Tony";

    class NonStaticInnerClass implements Runnable {
        public void run() {
            System.out.println(name);
        }
    }

    class StaticInnerClass implements Runnable {
        private String name;

        public StaticInnerClass(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {

        /*
         * Example 1. class level implementation
         */
        activate(this);

        /*
         * Example 2. anonymous class implementation
         */
        activate(new Runnable() {
            public void run() {
                System.out.println(name);
            }
        });

        /*
         * Example 3. method local inner-class implementation
         */
        class LocalInnerClass implements Runnable {
            public void run() {
                System.out.println(name);
            }
        }
        activate(new LocalInnerClass()); // call with the class we just created.

        /*
         * Example 4. non-static inner class
         */
        activate(new NonStaticInnerClass());

        /*
         * Example 5. static inner class
         */
        activate(new StaticInnerClass(name));

    }

    public void activate(Runnable runnable) {
        runnable.run();
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
