package com.irisida.lang.part03.chapter10.interfaces.firstexample;

public class Person implements Describable {

    @Override
    public String getDescription() {
        return "I am a Person object.";
    }

}
