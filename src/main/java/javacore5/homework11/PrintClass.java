package javacore5.homework11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintClass {

    public static void printFile(File file) throws IOException {
        String var;
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(file));

            try {
                while ((var = reader.readLine()) != null) {
                    System.out.println(var);
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
    }
}
