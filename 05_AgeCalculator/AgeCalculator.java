// Project 05: AgeCalculator
// Calculates approximate age

import java.util.*;

/**
 * Calculates approximate age
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class AgeCalculator {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Calculates approximate age");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
