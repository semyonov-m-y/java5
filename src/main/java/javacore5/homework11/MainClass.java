package javacore5.homework11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MainClass {

    static File file = new File("C:\\Users\\Максим\\IdeaProjects\\GoIt2\\GoIt\\java5\\src\\main\\java\\javacore5\\homework11\\task.txt");
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        System.out.println(ReplacerClass.replacer(map));
        ReplacerClass.fileContentReplacer(map);
        ReplacerClass.fileContentMerger(map);
        System.out.println(CheckClass.checkWord1("Max"));
        System.out.println(CheckClass.checkWord2("Max2Max3"));
    }
}
