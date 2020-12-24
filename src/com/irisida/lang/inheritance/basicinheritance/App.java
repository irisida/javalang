package com.irisida.lang.inheritance.basicinheritance;

public class App {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird();
        bird1.eat(); // call method that appears in both Bird and Animal.
        bird1.layEgg();
        bird1.sleep();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.sleep(); // call method that appears in both Dog and Animal.
    }
}
