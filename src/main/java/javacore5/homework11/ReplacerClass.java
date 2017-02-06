package javacore5.homework11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class ReplacerClass {

    public static String replacer(Map<String, String> map) throws IOException {
								List<String> lines = Files.readAllLines(Paths.get("src\\main\\java\\javacore5\\homework11\\task.txt"),
																StandardCharsets.UTF_8);

								String stringFromFile = "";
								for(String line : lines) {
												stringFromFile = line.concat(stringFromFile);
								}

								String replacedString = "";
								for(Map.Entry<String, String> pair : map.entrySet()){
												replacedString = stringFromFile.replaceAll(pair.getKey(), pair.getValue());
								}

								return replacedString;
    }

    public static File fileContentReplacer(Map<String, String> map) throws IOException {
        WriterClass.rewriteFile(replacer(map));

        return MainClass.TEXT_FILE;
    }

    public static File fileContentMerger(Map<String, String> map) throws IOException {
        WriterClass.appendStringToFile(replacer(map));

        return MainClass.TEXT_FILE;
    }

}
