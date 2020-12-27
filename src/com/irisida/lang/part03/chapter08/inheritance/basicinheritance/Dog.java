package com.irisida.lang.part03.chapter08.inheritance.basicinheritance;

public class Dog extends Animal {
    public void vocalise() {
        System.out.println("Dog -> vocalise('bark)");
    }

    @Override
    public void sleep() {
        System.out.println("Dog -> sleep()");
    }
}
