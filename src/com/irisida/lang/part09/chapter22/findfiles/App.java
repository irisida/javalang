package com.irisida.lang.part09.chapter22.findfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        /**
         * in this example we have set the path to a text file, set the content as the
         * result of a read of that file and we output the content to the console. It is
         * also worth noting that in this example we have made use of the launch.json to
         * reflect the "cwd" of the project, otherwise it will take the repositories
         * root folder which will not work as intended.
         */

        Path filepath = Paths.get("./sometext.txt");
        System.out.println(new File(filepath.toString()).exists());

        String retrievedContent = Files.readString(filepath);
        System.out.println(retrievedContent);

    }
}
