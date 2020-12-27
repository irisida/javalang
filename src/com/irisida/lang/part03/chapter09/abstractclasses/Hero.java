package com.irisida.lang.part03.chapter09.abstractclasses;

public class Hero extends GameObject {
    String name;

    public Hero() {
        this("DefaultMan!");
    }

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "{ name:" + this.name + " }";
    }
}
