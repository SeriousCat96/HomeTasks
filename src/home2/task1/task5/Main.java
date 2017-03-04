package home2.task1.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        List<String> words = words(file);
        List<Integer> labels = new ArrayList<>();

        String line;
        while (!(line = reader.readLine()).equals("end"))
        {
            labels.add(Integer.parseInt(line));
        }

        for (Integer label : labels) {
            System.out.println(words.get(label - 1));
        }

        reader.close();
    }

    public static List<String> words(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        List<String> words = new ArrayList<>();

        while (reader.ready()){
            String line = reader.readLine();
            words.add(line);
        }

        reader.close();
        return words;
    }



}
