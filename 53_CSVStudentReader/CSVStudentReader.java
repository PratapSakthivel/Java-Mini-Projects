// Project 53: CSVStudentReader
// Reads student CSV data

import java.util.*;

/**
 * Reads student CSV data
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class CSVStudentReader {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Reads student CSV data");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
