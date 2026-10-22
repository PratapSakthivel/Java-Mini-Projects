// Project 37: ContactBook
// Stores and searches contacts

import java.util.*;

/**
 * Stores and searches contacts
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ContactBook {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Stores and searches contacts");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
