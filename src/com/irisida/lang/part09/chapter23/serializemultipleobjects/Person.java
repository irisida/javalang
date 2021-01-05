package com.irisida.lang.part09.chapter23.serializemultipleobjects;

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
    private String name;
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
