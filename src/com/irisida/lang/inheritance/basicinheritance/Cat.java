package com.irisida.lang.inheritance.basicinheritance;

public class Cat extends Animal {
    public void vocalise() {
        System.out.println("Cat -> vocalise('purrr')");
    }

    @Override
    public void sleep() {
        System.out.println("Cat -> sleep('make whirring sound')");
    }
}
