package home2.task1.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        List<String> words = words(file);

        ListIterator<String> it = words.listIterator(words.size());

        while (it.hasPrevious())
        {
            System.out.println(it.previous());
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
