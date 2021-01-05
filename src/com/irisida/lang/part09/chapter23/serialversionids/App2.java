package com.irisida.lang.part09.chapter23.serialversionids;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App2 {
    public static void main(String[] args) {
        System.out.println("app2");

        String pathToFile = "test.bin";

        try (var ois = new ObjectInputStream(new FileInputStream(pathToFile))) {

            Person p = (Person) ois.readObject();
            System.out.printf("Loaded object from serialized file: %n\t%s%n", p.toString());

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
