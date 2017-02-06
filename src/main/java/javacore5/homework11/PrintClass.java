package javacore5.homework11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintClass {

    public static void printFile(File file) throws IOException {
        Files.lines(Paths.get("src\\main\\java\\javacore5\\homework11\\task.txt"), StandardCharsets.UTF_8)
                .forEach(System.out::println);
    }
}
