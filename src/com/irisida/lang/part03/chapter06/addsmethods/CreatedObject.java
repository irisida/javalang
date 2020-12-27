package com.irisida.lang.part03.chapter06.addsmethods;

public class CreatedObject {
    // class attributes
    String name;
    int age;

    // class methods
    void fullDescription() {
        System.out.printf("My name is %s and I am %d", this.name, this.age);
    }
}
