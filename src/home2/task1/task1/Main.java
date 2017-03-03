package home2.task1.task1;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        System.out.println(distinctWordsCount(file));
        reader.close();
    }

    public static int distinctWordsCount(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int count = 0;

        Set<String> set = new HashSet<>();

        while (reader.ready()){
            String line = reader.readLine();

            String[] words = line.split("\\p{Space}");

            Collections.addAll(set, words);
        }

        reader.close();
        return set.size();
    }
}
