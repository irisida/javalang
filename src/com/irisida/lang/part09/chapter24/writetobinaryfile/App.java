package com.irisida.lang.part09.chapter24.writetobinaryfile;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String fileName = "testData.bin";
        File file = new File(fileName);

        System.out.println("File length: " + file.length());

        byte[] bytes = new byte[10];

        for (int i = 0; i < 10; i++) {
            bytes[i] = (byte) i;
        }

        try (var data = new DataOutputStream(new FileOutputStream(fileName))) {
            data.write(bytes);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception was caught with " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("IOException caught on " + file.getAbsolutePath());
        }

        System.out.println("Written " + file.getAbsolutePath());
        System.out.println("File length: " + file.length());
    }

}
