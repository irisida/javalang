package com.irisida.lang.part07.chapter18.constructorandclose;

public class App {
    public static void main(String[] args) {

        /*
         * This demo, although working, is not a best practice. Code like this
         */

        Database db = null;

        try {
            // db = new Database("mockhost:5000"); // good case
            db = new Database(null); // null case
            // db = new Database("123"); // bad data fetch case
            db.getData();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                db.close();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException" + e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
