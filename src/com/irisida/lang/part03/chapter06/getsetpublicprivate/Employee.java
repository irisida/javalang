package com.irisida.lang.part03.chapter06.getsetpublicprivate;

public class Employee {
    /*
     * set the attributes as private. This makes them accessible only from within
     * the file.
     */
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String role;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
