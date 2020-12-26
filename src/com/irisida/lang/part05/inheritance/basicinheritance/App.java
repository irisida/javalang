package com.irisida.lang.part05.inheritance.basicinheritance;

public class App {

    public static void main(String[] args) {

        Animal[] animals = { new Bird(), new Dog(), new Cat() };

        for (Animal beast : animals) {
            beast.eat();
            beast.sleep();
        }

    }
}