package com.irisida.lang.part06.chapter15.withconstructor;

public enum Fruits {
    APPLE("green"), ORANGE("orange"), MELON("yellow"), GRAPEFRUIT("green"), PINEAPPLE("brown");

    private String color;

    Fruits(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase() + "(" + color + ")";
    }
}
