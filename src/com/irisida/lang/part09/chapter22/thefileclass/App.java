package com.irisida.lang.part09.chapter22.thefileclass;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        /*
         * Simple demo with the purpose of showing the file class. Using the java.io
         * file class gives us access to certain methods for paths. Note that passing
         * the "." in the new file declaration will take the directory it was called
         * from as the base.
         */

        File currentDir = new File(".");

        System.out.println(currentDir.getCanonicalPath());

        for (String f : currentDir.list()) {
            System.out.println(f);
        }

    }
}
