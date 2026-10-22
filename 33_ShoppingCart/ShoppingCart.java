// Project 33: ShoppingCart
// Adds items and calculates total

import java.util.*;

/**
 * Adds items and calculates total
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Adds items and calculates total");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
