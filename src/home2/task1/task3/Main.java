package home2.task1.task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        Map<String, Integer> words = words(file);

        System.out.println(words);
        reader.close();
    }

    public static Map<String, Integer> words(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        Map<String, Integer> map = new HashMap<>();

        while (reader.ready()){
            String line = reader.readLine();

            String[] words = line.split("\\p{Space}");

            for (String word : words)
            {
                if (!map.containsKey(word)) map.put(word, 1);
                else map.put(word, map.get(word) + 1);
            }
        }

        reader.close();
        return map;
    }


}
