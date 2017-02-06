package javacore5.homework11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RestoreClass {

    private static FileWriter writer = null;

    public static File restoreFile(String string) throws IOException {
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
}
