package com.levelp.jb2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Ledowsky on 06.09.2017.
 */

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("HelloWorld!!!");

        String fileName = "2.txt";

        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("C:\\JavaRush\\archive.zip"));

        zip.putNextEntry(new ZipEntry(fileName));

        File file = new File("C:\\JavaRush\\".concat(fileName));
        Files.copy(file.toPath(),zip);
        System.out.println("Operation successful!");
    }
}
