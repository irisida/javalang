package com.irisida.lang.part03.chapter06.getsetpublicprivate;

public class App {
    public static void main(String[] args) {

        // declare the instance of our class.
        Employee emp = new Employee();

        // set the attribute values by using the setter methods
        // we created to populate the private attribute fields.
        emp.setFirstName("ed");
        emp.setLastName("leonard");
        emp.setAge(25);
        emp.setDepartment("tech");
        emp.setRole("software engineer");

        // read the values from the attributes and output to the console.
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp.getRole());
        System.out.println(emp.getDepartment());
    }
}
