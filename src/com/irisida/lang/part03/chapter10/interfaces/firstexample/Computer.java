package com.irisida.lang.part03.chapter10.interfaces.firstexample;

public class Computer implements Describable {

    @Override
    public String getDescription() {
        return "I am a Computer object.";
    }

}
