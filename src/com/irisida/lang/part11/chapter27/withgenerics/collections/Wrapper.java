package com.irisida.lang.part11.chapter27.withgenerics.collections;

public class Wrapper<E> {
    private E object;

    public void Set(E object) {
        this.object = object;
    }

    public E get() {
        return object;
    }
}
