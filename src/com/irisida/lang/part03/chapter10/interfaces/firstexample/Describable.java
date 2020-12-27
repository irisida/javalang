package com.irisida.lang.part03.chapter10.interfaces.firstexample;

public interface Describable {

    /*
     * Interfaces allow us to group objects, sometimes with loose connection but
     * some commonality such as being required to be part of an array with other
     * objects. The type system requires us to provide single types/classes for a
     * collection. This allows us to do so.
     */

    public String getDescription();
}
