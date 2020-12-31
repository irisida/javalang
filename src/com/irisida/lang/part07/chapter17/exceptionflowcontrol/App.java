package com.irisida.lang.part07.chapter17.exceptionflowcontrol;

public class App {

    /*
     * The demo here has a purpose of showing some basic flow control with
     * exceptions. As we know, once an exception is thrown in a block of code no
     * further code in that block is executed. Instead Java will hoist that up to
     * the final handler or all the way out of the program itself.
     *
     * We see here we have a "program completed" statement but in the event of a
     * null value for name which we have engineered then the exception is thrown in
     * the Person class. It is hoisted up to the main and caught in the try catch
     * block. Upon being caught we sysout the exception getMessage and re throw the
     * exception. As our main method throws exception the sysout to shw the program
     * has completed can never be reached in a set of conditions where the name is
     * null.
     *
     * With the addition of the finally block note that we can determine some action
     * that should be taken even in the case of exception being thrown but also that
     * the program completed is still skipped because it will exit after the finally
     * block is completed.
     */

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        try {
            person.setName(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("I am inside the finally block");
        }

        System.out.println("program completed!"); // never reached.
    }
}
