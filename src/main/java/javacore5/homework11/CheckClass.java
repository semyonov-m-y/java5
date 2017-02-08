package javacore5.homework11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClass {

    public static int checkWord1(String word) throws IOException {
        int wordsCounter1 = 0;
        ArrayList<String> list = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File("src\\main\\java\\javacore5\\homework11\\task.txt"));

            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = null;

        for (int i = 0; i < list.size(); i++) {
            matcher = pattern.matcher(list.get(i));
        }

        while (matcher.find()) {
            wordsCounter1++;
        }

        return wordsCounter1;
    }

    public static int checkWord2(String word) throws IOException {
        int wordsCounter2 = 0;
        ArrayList<String> list = new ArrayList();

        try (Scanner scanner = new Scanner(new File("src\\main\\java\\javacore5\\homework11\\task.txt"))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = null;

        for (int i = 0; i < list.size(); i++) {
            matcher = pattern.matcher(list.get(i));
        }

        while (matcher.find()) {
            wordsCounter2++;
        }

        return wordsCounter2;
    }
}
