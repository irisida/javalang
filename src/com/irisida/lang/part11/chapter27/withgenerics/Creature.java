package com.irisida.lang.part11.chapter27.withgenerics;

public class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + "}";
    }

    public String getName() {
        return this.name;
    }

}
