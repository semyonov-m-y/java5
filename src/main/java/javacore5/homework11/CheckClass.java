package javacore5.homework11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckClass {

    static String var;
    static int wordsCounter = 0;
    public static int checkWord1(String word) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(MainClass.file));

            try {
                while ((var = reader.readLine()) != null) {
                    if (word.contains(var)) {
                        wordsCounter++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return wordsCounter;
    }

    public static int checkWord2(String word) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(MainClass.file));

        try {
            while ((var = reader.readLine()) != null) {
                if (word.contains(var)) {
                    wordsCounter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return wordsCounter;
    }
}
