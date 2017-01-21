package javacore5.homework11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ReplacerClass {

    static FileWriter writer = null;
    public static String replacer(Map<String, String> map) throws IOException {
        String var;
        String string = "Max";
        String replacedString = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(MainClass.file));

            try {
                while ((var = reader.readLine()) != null) {
                    map.put(var, string);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            replacedString = value;
        }

        return replacedString;
    }

    public static File fileContentReplacer(Map<String, String> map) throws IOException {
        String string = "Max1";

        replacer(map);

        try {
            writer = new FileWriter(MainClass.file);
            writer.write(string);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        PrintClass.printFile(MainClass.file);

        return MainClass.file;
    }

    public static File fileContentMerger(Map<String, String> map) throws IOException {
        String string = "Max2";
        String string1 = "Max3";

        replacer(map);

        try {
            writer = new FileWriter(MainClass.file);
            writer.write(string);
            writer.append(string1);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        PrintClass.printFile(MainClass.file);

        return MainClass.file;
    }
}
