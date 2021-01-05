package com.irisida.lang.part09.chapter23.serializemultipleobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class App2 {
    public static void main(String[] args) {
        System.out.println("app2");

        String pathToFile = "test.bin";

        try (var ois = new ObjectInputStream(new FileInputStream(pathToFile))) {

            /**
             * create an array of Serializable to be able to iterate over the objects using
             * the for-in syntax to iterate, we convert them to a Person Object with a cast.
             */

            Serializable[] people = (Serializable[]) ois.readObject();

            for (var p : people) {
                Person person = (Person) p;
                System.out.println(person.toString());
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found " + pathToFile);
        } catch (IOException e) {
            System.out.println("Cannot read file " + pathToFile);
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot read object from file " + pathToFile);
        }

        System.out.println("operation completed");
    }
}