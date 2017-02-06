package javacore5.homework11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClass {

    public static int checkWord1(String word) throws IOException {
        int wordsCounter1 = 0;
        List<String> lines = Files.readAllLines(Paths.get("src\\main\\java\\javacore5\\homework11\\task.txt"),
                StandardCharsets.UTF_8);

        for (String line : lines) {
            line.split(word);
            if (line.split(word) != null) {
                wordsCounter1++;
            }
        }

        return wordsCounter1;
    }

    public static int checkWord2(String word) throws IOException {
        int wordsCounter2 = 0;
    	/*ArrayList<String> list = new ArrayList<>();
    	Scanner file = new Scanner(new File("src\\main\\java\\javacore5\\homework11\\task.txt"));
    	while (file.hasNext()) {
    		list.add(file.nextLine());
    	}

    	for (int i = 0; i < list.size(); i++) {
    		if (word.equals(list.get(i))) {
    			System.out.println(list.get(i));
    			wordsCounter2++;
    		}
    	}

    	for (String line : list) {
        	line.split(word);
            if (line.toString().contains(word)) {
                wordsCounter2++;
            }
        }*/
        Pattern p = Pattern.compile(word, Pattern.UNICODE_CASE| Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(word);
        while (m.find()) wordsCounter2++;

        return wordsCounter2;
    }
}
