package com.irisida.lang.inheritance.useprotected.entities;

public class Fruit {
    // protected attribute. Has package level scope.
    protected int id;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fruit [ id:" + id + "]");

        return sb.toString();
    }
}
