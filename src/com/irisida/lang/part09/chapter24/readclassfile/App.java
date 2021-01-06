package com.irisida.lang.part09.chapter24.readclassfile;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String fileName = "HelloWorld.class";
        File file = new File(fileName);

        if (!file.exists()) {
            System.err.println("file does not exist: " + fileName);
        }

        try (var data = new DataInputStream(new FileInputStream(file))) {
            int magicNumber = data.readInt();
            System.out.printf("%x", magicNumber);

            int minorVersion = data.readUnsignedShort();
            int majorVersion = data.readUnsignedShort();
            System.out.printf("%d.%d", majorVersion, minorVersion); // version 59 corresponds to java 15

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception was caught with " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("IOException caught on " + file.getAbsolutePath());
        }
    }
}
