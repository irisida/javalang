package com.irisida.lang.inheritance.basicinheritance;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog -> bark()");
    }

    @Override
    public void sleep() {
        System.out.println("Dog -> sleep()");
    }
}
