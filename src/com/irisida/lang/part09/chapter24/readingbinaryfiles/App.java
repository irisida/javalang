package com.irisida.lang.part09.chapter24.readingbinaryfiles;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        String fileName = "testData.bin";
        writeFile(fileName);

        readFile(fileName);
    }

    private void readFile(String fileName) {
        File file = new File(fileName);

        try (var data = new DataInputStream(new FileInputStream(fileName))) {
            byte[] bytes = data.readAllBytes();
            System.out.println(bytes);

            for (byte b : bytes) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception was caught with " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("IOException caught on " + file.getAbsolutePath());
        }

    }

    private void writeFile(String fileName) {

        File file = new File(fileName);
        System.out.println("File length: " + file.length());

        /**
         * create some sample data to write to the file
         */
        byte[] bytes = new byte[10];

        for (int i = 0; i < 10; i++) {
            bytes[i] = (byte) i;
        }

        /**
         * the write sequence uses a tryWithResources syntax
         */
        try (var data = new DataOutputStream(new FileOutputStream(fileName))) {
            data.write(bytes);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception was caught with " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("IOException caught on " + file.getAbsolutePath());
        }

        /**
         * completion output
         */
        System.out.println("Written " + file.getAbsolutePath());
        System.out.println("File length: " + file.length());
    }

}
