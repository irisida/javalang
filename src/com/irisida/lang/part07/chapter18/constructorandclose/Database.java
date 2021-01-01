package com.irisida.lang.part07.chapter18.constructorandclose;

public class Database implements AutoCloseable {

    /*
     * adding the AutoCloseable interface means we need to have/use a close()
     * method. this is a good way to prevent resource leaks and memory leaks in your
     * program.
     */

    private String connectionString;

    public Database(String connectionString) throws Exception {
        System.out.println("opening connection to " + connectionString);

        if (connectionString == null) {
            throw new Exception("No connectionString given, no connection possible.");
        }

        this.connectionString = connectionString;
        System.out.println("Successfully connected to: " + this.connectionString);
    }

    public void getData() throws Exception {
        System.out.println("Getting data from db");

        if (this.connectionString.length() < 5) {
            throw new Exception("There was a problem getting the data from db");
        }

        System.out.println("Got data from: " + connectionString);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing connection to: " + this.connectionString);

        if (connectionString == null) {
            throw new Exception("ConnectionString was null. Closing connection is not possible");
        }

        System.out.println("Successfully close connection to: " + this.connectionString);
    }

}
