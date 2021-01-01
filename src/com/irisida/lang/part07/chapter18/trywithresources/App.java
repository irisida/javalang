package com.irisida.lang.part07.chapter18.trywithresources;

public class App {
    public static void main(String[] args) {

        /*
         * This demo deals with TryWithResources which was introduced in java 7 and is
         * useful for classes that implement autoCloseable.
         *
         * Note we declare and initialise the db as a parameter to the try. Marvel at
         * how much simpler the code is with this construct.
         *
         * Our database implements autoCloseable and therefore has a close() method, we
         * can see in the execution here that we're calling the close implicitly.
         */

        try (Database db = new Database("1234")) {
            db.getData();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
