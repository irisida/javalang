package com.irisida.lang.part03.chapter06.simpleclass;

class Role {
    /*
     * here we define a class. As per description its basically a template for how
     * to create an object and not an object itself. When we create an instance of
     * this type of class the memory to hold a reference to it will be claimed, or
     * set aside. That reference will point to the actual object that is created on
     * the garbage collection heap.
     */
    String firstName;
    String lastName;
    String job;
}

public class SimpleClass {
    public static void main(String[] args) {
        /*
         * Here we're declaring and setting the attributes of our objects. Note that in
         * our design so far we have nothing to sanitise or prevent misuse, or poor use.
         * We have a trivial class that holds some reference type variables as its
         * attributes.
         */
        Role manager = new Role();
        manager.firstName = "Ed";
        manager.lastName = "Leonard";
        manager.job = "manager";

        Role programmer = new Role();
        programmer.firstName = "Bob";
        programmer.lastName = "Carolgees";
        programmer.job = "Dog handler";

        System.out.println(manager.firstName);
    }
}
