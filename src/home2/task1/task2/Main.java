package home2.task1.task2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        List<String> words = distinctWords(file);

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) return o1.length() > o2.length() ? 1 : (o1.length() < o2.length() ? -1 : 0);
                else return o1.compareTo(o2);
            }
        });

        System.out.println(words);
        reader.close();
    }

    public static List<String> distinctWords(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Set<String> set = new HashSet<>();

        while (reader.ready()){
            String line = reader.readLine();

            String[] words = line.split("\\p{Space}");

            Collections.addAll(set, words);
        }

        reader.close();
        return new ArrayList<>(set);
    }


}
