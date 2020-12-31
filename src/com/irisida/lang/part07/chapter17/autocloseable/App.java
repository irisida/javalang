package com.irisida.lang.part07.chapter17.autocloseable;

public class App {
    public static void main(String[] args) {
        Database db = new Database("mockhost:5000");

        db.getData();
        db.close();
    }
}
