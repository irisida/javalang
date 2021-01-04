package com.irisida.lang.part09.chapter22.readwritefiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {

        /**
         * A basic writing to file demo using the Files class. The write method has an
         * options parameter but it is not mandatory. Note here we have used the Paths
         * class to extend the file path capabilities here.
         */

        String myText = "This text will be\nadded to a file we create";
        Path filepath = Paths.get("./output.txt");
        Files.write(filepath, myText.getBytes());

        /**
         * A reading files example
         */

        String retrievedContent = Files.readString(filepath);
        System.out.println(retrievedContent);
    }
}
