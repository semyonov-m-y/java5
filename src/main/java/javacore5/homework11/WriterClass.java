package javacore5.homework11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {

    private static FileWriter writer = null;

    public static File rewriteFile(String string) throws IOException {
        try {
            writer = new FileWriter(MainClass.TEXTFILE);
            writer.write(string);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        return MainClass.TEXTFILE;
    }

    public static File appendStringToFile(String appendedString, String string) throws IOException {
        try {
            writer = new FileWriter(MainClass.TEXTFILE);
            writer.append(appendedString);
            writer.append(string);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        return MainClass.TEXTFILE;
    }
}

