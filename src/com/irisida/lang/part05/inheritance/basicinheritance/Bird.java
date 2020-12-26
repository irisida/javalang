package com.irisida.lang.part05.inheritance.basicinheritance;

public class Bird extends Animal {
    // subclass of animal

    public void fly() {
        System.out.println("Bird - fly()");
    }

    public void layEgg() {
        System.out.println("Bird - layEgg()");
    }

    public void vocalise() {
        System.out.println("Bird -> vocalise('whistle')");
    }

    @Override
    public void eat() {
        System.out.println("Bird - eat()");
    }
}
