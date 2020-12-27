package com.irisida.lang.part06.abstractclasses;

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
