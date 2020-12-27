package com.irisida.lang.part03.chapter09.abstractclasses.gameobjectexample;

public class Enemy extends GameObject {
    String name;

    public Enemy() {
        this("BigBaddy!");
    }

    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "{ name:" + this.name + " }";
    }
}
