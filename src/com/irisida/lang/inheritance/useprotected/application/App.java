package com.irisida.lang.inheritance.useprotected.application;

import com.irisida.lang.inheritance.useprotected.entities.Apple;
import com.irisida.lang.inheritance.useprotected.entities.Banana;
import com.irisida.lang.inheritance.useprotected.entities.Fruit;

public class App {
    public static void main(String[] args) {

        /*
         * The fruits and Fruit itself belong to another package, so here we're demoing
         * the capabilities of using the protected keyword. In this demo we're
         * protecting the id property. Using the protected keyword mean that the
         * property is accessible or mutable within the entities package but not within
         * other packages such as the application package here housing the main method.
         */

        Fruit fruit1 = new Apple();
        System.out.println(fruit1);

        Fruit fruit2 = new Banana();
        System.out.println(fruit2);
    }
}
