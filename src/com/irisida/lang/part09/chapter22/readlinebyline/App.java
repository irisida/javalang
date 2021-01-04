package com.irisida.lang.part09.chapter22.readlinebyline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {

        /**
         * Create the Path object holding the target
         */
        Path pathToSourceFile = Paths.get("./testdata.txt");
        System.out.println(new File(pathToSourceFile.toString()).exists());

        /*
         * Read a file with FileReader, requires a TryWithResources approach. Not we
         * have to toString() the path object.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(pathToSourceFile.toString()))) {
            String line = null;

            /*
             * loop across the file line by line for as long as the value is not null
             */
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found at " + pathToSourceFile);
        } catch (IOException e) {
            System.err.println("IOException thrown on file " + pathToSourceFile);
        }

    }
}
