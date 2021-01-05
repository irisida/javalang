package com.irisida.lang.part09.chapter23.serializingobjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

class Person implements Serializable {
    private String name;
    private int id;

    public Person() {
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person id(int id) {
        this.id = id;
        return this;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", id='" + getId() + "'" + "}";
    }

}

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Swiss Tony", 1);

        System.out.println(p1.toString());

        String pathToFile = "test.bin";

        try (var oos = new ObjectOutputStream(new FileOutputStream(pathToFile))) {
            oos.writeObject(p1);
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + pathToFile);
        } catch (IOException e) {
            System.out.println("Cannot write file " + pathToFile);
        }

        System.out.println("operation completed");

    }
}
