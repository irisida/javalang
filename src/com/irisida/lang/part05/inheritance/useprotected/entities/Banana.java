package com.irisida.lang.part05.inheritance.useprotected.entities;

public class Banana extends Fruit {
    // do something
    public Banana() {
        id = 13444; // we can set/reset the property here because this subclass extends the Fruit
                    // class and therefore we inherit all properties.
    }
}
