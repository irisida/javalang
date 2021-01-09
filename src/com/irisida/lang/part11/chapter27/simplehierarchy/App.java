package com.irisida.lang.part11.chapter27.simplehierarchy;

import com.irisida.lang.part11.chapter27.simplehierarchy.collections.Wrapper;

public class App {
    public static void main(String[] args) {

        /**
         * The demo here using a Wrapper class which uses the ultimate parent in Java,
         * Object. The limitations here are that Object will remove the notion of
         * control because as we odd objects that fit within the normal polymorphism
         * model that we have here with Creature, Mammal & Cat there is nothing to stop
         * us adding to an Array of Wrapper something that is outside of this flavour of
         * object.
         *
         * Hence the introduction of generics which we will look at in the next example.
         */

        Wrapper wrapper = new Wrapper();

        Cat cat = new Cat("Mog");

        wrapper.Set(cat);

        Cat retrieved = (Cat) wrapper.get();

        System.out.println(retrieved);
    }
}
