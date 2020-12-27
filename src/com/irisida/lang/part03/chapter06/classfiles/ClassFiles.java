package com.irisida.lang.part03.chapter06.classfiles;

public class ClassFiles {
    public static void main(String[] args) {
        /*
         * We have a user-defined class we created in another file in this project. It
         * is called the CreatedObject class and simple has a name attribute. The class
         * was created in the same package and therefore we can use it as if it were
         * declared in this file.
         */

        CreatedObject myObj = new CreatedObject();
        myObj.name = "CreatedObject";

        System.out.println(myObj.name);
    }

}
