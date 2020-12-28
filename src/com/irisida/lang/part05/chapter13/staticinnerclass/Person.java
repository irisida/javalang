package com.irisida.lang.part05.chapter13.staticinnerclass;

public class Person {
    // static inner classes
    static class Head {
        public void describe() {
            System.out.println("Head.describe()");
        }
    }

    static class Body {
        public void describe() {
            System.out.println("Body.describe()");
        }
    }

    public void describe() {
        System.out.println("Person.describe()");
        Head head = new Head();
        Body body = new Body();

        head.describe();
        body.describe();
    }
}
