package com.irisida.lang.part11.chapter27.withgenerics;

import com.irisida.lang.part11.chapter27.withgenerics.collections.Wrapper;

public class App {
    public static void main(String[] args) {

        /**
         * Note we have introduced the diamond bracket notation to add generics
         * capabilities. In this case as we have set expectation that wrapper will deal
         * with Cat classes if we create a Mammal/Creature with this same wrapper we
         * would have compilation issues. The transitive nature means that id we create
         * a Wrapper<Creature> we could pass in a Mammal or Cat, but it does not work in
         * the other direction.
         */

        Wrapper<Cat> wrapper = new Wrapper<>();

        Cat cat = new Cat("Mog");

        wrapper.Set(cat);

        Cat retrieved = (Cat) wrapper.get();

        System.out.println(retrieved);
    }
}
