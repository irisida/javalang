package com.irisida.lang.part06.abstractclasses;

public class Ship extends GameObject {
    String type;

    public Ship() {
        this("Century Sparrow!");
    }

    public Ship(String type) {
        this.type = type;
    }

    @Override
    public String describe() {
        return "{ type:" + this.type + " }";
    }
}
