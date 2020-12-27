package com.irisida.lang.part03.chapter10.interfaces.multipleinheritance;

public class Person implements Speaker, Greeter {

    /*
     * An example of how java handles the concept of multiple inheritance, by using
     * interfaces and implementing only what is needed.
     */

    @Override
    public void greet() {
        System.out.println("Hello there.");

    }

    @Override
    public void speak() {
        System.out.println("says stuff out load");

    }

}
