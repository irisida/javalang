package com.irisida.lang.part05.inheritance.constructorchain;

public class Person {
    String name;

    public Person() {
        this("Not provided");
        System.out.println("Person -> no param Constructor");
    }

    public Person(String name) {
        this.name = name;
        System.out.printf("Person -> Constructor(%s) %n", name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name            : ").append(this.name).append("\n");

        return sb.toString();
    }
}
