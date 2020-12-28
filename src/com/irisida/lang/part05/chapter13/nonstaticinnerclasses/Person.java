package com.irisida.lang.part05.chapter13.nonstaticinnerclasses;

/*
 * Non static inner classes demo. As non-static inner classes are associated
 * with instances of a class and can therefore access instance variables.
 * We can rationalise that non-static inner classes are associated with
 * 'particular' objects.
 */

public class Person {
    private String name;

    private class Describer {
        public void describe() {
            System.out.printf("name: %s%n", Person.this.name);
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        Describer describer = new Describer();
        describer.describe();
    }
}
