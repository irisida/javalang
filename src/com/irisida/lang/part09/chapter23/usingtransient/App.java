package com.irisida.lang.part09.chapter23.usingtransient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

class Person implements Serializable {
    /**
     * note in the demo here we have made the deserialization almost useless by
     * making the name transient. Transient prevents the serialization of a field
     * and therefore when we deserialize it we should expect a null value. In the
     * case we wanted to make the id transient we should use the class Integer over
     * the primitive int as with int the value of id after deserialization will be 0
     * but with the Integer class it will be null.
     */
    private static final long serialVersionUID = 1L;
    private transient String name;
    private int id;

    public Person() {
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

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person id(int id) {
        this.id = id;
        return this;
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

        /**
         * scenario 2 where we are deserializing an object previously created but as we
         * have made some fields (name) transient we will not have the value as we might
         * expect.
         *
         * Transients are no serialised. Also worth noting that the deserialization
         * process will not call complex constructor logic therefore we should not
         * expect to be able to perform complex constructor operations on an object
         * created by deserializing.
         */

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
