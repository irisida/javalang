package com.irisida.lang.part09.chapter23.serialversionids;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App1 {
    public static void main(String[] args) {
        System.out.println("app1");

        /**
         * scenario where we are creating an object and serializing it.
         */

        Person p1 = new Person("Swiss Tony", 31415);

        System.out.printf("created new object: %n\t%s%n", p1.toString());

        String pathToFile = "test.bin";

        try (var oos = new ObjectOutputStream(new FileOutputStream(pathToFile))) {
            oos.writeObject(p1);
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + pathToFile);
        } catch (IOException e) {
            System.out.println("Cannot write file " + pathToFile);
        }
    }
}
