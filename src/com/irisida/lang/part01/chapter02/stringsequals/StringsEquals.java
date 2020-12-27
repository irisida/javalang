package com.irisida.lang.part01.chapter02.stringsequals;

public class StringsEquals {
    public static void main(String[] args) {
        String val1 = "TestString";
        String val2 = "TestString";

        /*
         * Java is smart enough to make optimisatins here at the JVM level. It can see
         * that the values are exactly the same and although we have two unrelated
         * variables that happen to hold the same value, what we see underneath is that
         * the variables are for a reference variable type, String, therefore Java is
         * storing a single vesion of this value in memory and both of these variables
         * are pointed to that location/value.
         */

        System.out.println(val1.equals(val2));
    }

}
