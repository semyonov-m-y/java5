package javacore5.homework11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {

    private static FileWriter writer = null;

    public static File rewriteFile(String string) throws IOException {
        try {
            writer = new FileWriter(MainClass.TEXT_FILE);
            writer.write(string);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        return MainClass.TEXT_FILE;
    }

    public static File appendStringToFile(String string) throws IOException {
        String appendedString = " COOL!";
        try {
            writer = new FileWriter(MainClass.TEXT_FILE);
            writer.append(string);
            writer.append(appendedString);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        return MainClass.TEXT_FILE;
    }
}
