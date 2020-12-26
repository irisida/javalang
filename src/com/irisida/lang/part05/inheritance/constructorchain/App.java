package com.irisida.lang.part05.inheritance.constructorchain;

public class App {
    public static void main(String[] args) {

        /*
         * Creates a Contractor which extends employee, which extends person. This is
         * the call that will utilise the full constructors chain we have created. Note
         * that the toString method called is the one for Contractor despite there being
         * toString methods for both levels of super() objects.
         */
        Contractor dev = new Contractor();
        System.out.println(dev);

        /*
         * has no access to the attributes of contractor and the toString uses the
         * toString on employee.
         */
        Employee newdev = new Employee();
        System.out.println(newdev);
    }
}
