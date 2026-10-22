// Project 17: WordCounter
// Counts words in text

import java.util.*;

/**
 * Counts words in text
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class WordCounter {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Counts words in text");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
