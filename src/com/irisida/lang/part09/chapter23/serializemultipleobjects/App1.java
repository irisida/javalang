package com.irisida.lang.part09.chapter23.serializemultipleobjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App1 {
    public static void main(String[] args) {
        System.out.println("app1");

        Serializable[] people = new Serializable[5];

        for (int i = 0; i < people.length; i++) {
            String name = "person" + i;
            int id = 1000 + i;
            people[i] = new Person(name, id);
        }

        /**
         * now we have created an array of our Person objects we can serialize it as the
         * completion step for the app1 here.
         */

        String pathToFile = "test.bin";

        try (var oos = new ObjectOutputStream(new FileOutputStream(pathToFile))) {
            oos.writeObject(people);
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + pathToFile);
        } catch (IOException e) {
            System.out.println("Cannot write file " + pathToFile);
        }
    }
}
