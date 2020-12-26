package com.irisida.lang.part03.methods.addsmethods;

public class AddsMethods {
    public static void main(String[] args) {
        // create an instance of our class
        CreatedObject myObject = new CreatedObject();

        // set some of the attributes
        myObject.name = "ed";
        myObject.age = 20;

        // call the available method.
        myObject.fullDescription();
    }
}
