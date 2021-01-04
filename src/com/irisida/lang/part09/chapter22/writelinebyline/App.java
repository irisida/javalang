package com.irisida.lang.part09.chapter22.writelinebyline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {

        Path pathToSourceFile = Paths.get("./testdata.txt");
        System.out.println(new File(pathToSourceFile.toString()).exists());

        /**
         * build the local error messages for this main method.
         */
        final String FILE_NOT_FOUND_EXCEPTION = "File not found at " + pathToSourceFile;
        final String IO_EXCEPTION = "IOException thrown on file " + pathToSourceFile;

        /**
         * Read a file with FileReader, requires a TryWithResources approach. Not we
         * have to toString() the path object.
         */
        try (var br = new BufferedReader(new FileReader(pathToSourceFile.toString()))) {
            doWriteToFile(br);
        } catch (FileNotFoundException e) {
            System.err.println(FILE_NOT_FOUND_EXCEPTION);
        } catch (IOException e) {
            System.err.println(IO_EXCEPTION);
        }
    }

    public static void doWriteToFile(BufferedReader br) {
        String line = null;
        String fileLocation = "./writtenFile.txt";
        /**
         * build the local messages used in the method.
         */
        final String IO_EXCEPTION = "Cannot write file " + fileLocation;
        final String SUCCESS_MSG = "file write completed " + fileLocation;

        try (var bw = new BufferedWriter(new FileWriter(fileLocation))) {

            /**
             * traverse the content of the source file from main line by line and write to
             * the new file we have created.
             */
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(IO_EXCEPTION);
        }

        System.out.println(SUCCESS_MSG);
    }
}
