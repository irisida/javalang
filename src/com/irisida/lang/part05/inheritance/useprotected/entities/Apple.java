package com.irisida.lang.part05.inheritance.useprotected.entities;

public class Apple extends Fruit {
    // do something

    public Apple() {
        id = 12255; // we can set/reset the property here because this subclass extends the Fruit
                    // class and therefore we inherit all properties.
    }
}
