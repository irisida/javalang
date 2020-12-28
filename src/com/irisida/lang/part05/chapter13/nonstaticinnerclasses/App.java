package com.irisida.lang.part05.chapter13.nonstaticinnerclasses;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Swiss Tony");
        person1.displayInfo();

        Person person2 = new Person("Fat Bob");
        person2.displayInfo();
    }
}