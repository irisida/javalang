package com.irisida.lang.part07.chapter17.autocloseable;

public class Database implements AutoCloseable {

    /*
     * adding the AutoCloseable interface means we need to have/use a close()
     * method. this is a good way to prevent resource leaks and memory leaks in your
     * program.
     */

    private String connectionString;

    public Database(String connectionString) {
        System.out.println("opening connection to " + connectionString);
        this.connectionString = connectionString;
    }

    public void getData() {
        System.out.println("getting data from: " + connectionString);
    }

    @Override
    public void close() {
        // removed the throws exception for the generated interface method.
        System.out.println("closing connection to: " + this.connectionString);
    }

}
