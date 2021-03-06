package com.irisida.lang.part03.chapter08.inheritance.basicinheritance;

public class Cat extends Animal {
    public void vocalise() {
        System.out.println("Cat -> vocalise('purrr')");
    }

    @Override
    public void sleep() {
        System.out.println("Cat -> sleep('make whirring sound')");
    }
}
