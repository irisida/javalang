package com.irisida.lang.part03.chapter09.abstractclasses;

public class App {
    public static void main(String[] args) {

        /*
         * First example capitalises on the previous OO examples by using constructor
         * chaining for attribute completion. We also have the implementations of the
         * abstract classes associated methods allowing us to keep all the objects in an
         * array of game objects because although each game object is different, they
         * are all of the GameObject class.
         */
        GameObject[] objs1 = { new Hero(), new Enemy(), new Ship() };

        for (GameObject o : objs1) {
            System.out.println(o.describe());
        }

        /*
         * This example passes values, therefore calls the constructors that expect
         * params.
         */
        GameObject[] objs2 = { new Hero("Batman"), new Enemy("joker"), new Ship("batcopter") };

        for (GameObject o : objs2) {
            System.out.println(o.describe());
        }
    }
}
