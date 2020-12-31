package com.irisida.lang.part07.chapter17.exceptionflowcontrol;

public class Person {
    String name;

    void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Name cannot be null");
        }
        System.out.println("Name is set as: " + name);
    }
}
