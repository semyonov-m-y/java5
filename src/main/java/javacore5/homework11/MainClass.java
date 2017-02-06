package javacore5.homework11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MainClass {

    public static File TEXT_FILE = new File("src\\main\\java\\javacore5\\homework11\\task.txt");
    private static String restoreString = "Tool to help programmers write code that adheres to coding standards. " +
            "Detects a variety of other coding problems.";

    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        map.put("coding", "coveralls");

        System.out.println("Replacer method: " + ReplacerClass.replacer(map));
        PrintClass.printFile(ReplacerClass.fileContentReplacer(map));
        PrintClass.printFile(ReplacerClass.fileContentMerger(map));
        System.out.println("Try: checkWors - " + CheckClass.checkWord1("coveralls"));
        System.out.println("Try-with-resources: checkWords - " + CheckClass.checkWord2("coveralls"));
        RestoreClass.restoreFile(restoreString);
    }
}
