package com.irisida.lang.inheritance.basicinheritance;

public class Bird extends Animal {
    // subclass of animal

    public void fly() {
        System.out.println("Bird - fly()");
    }

    public void layEgg() {
        System.out.println("Bird - layEgg()");
    }

    @Override
    public void eat() {
        System.out.println("Bird - eat()");
    }
}
