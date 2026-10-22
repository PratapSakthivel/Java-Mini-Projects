// Project 09: CoinToss
// Simulates heads or tails

import java.util.*;

/**
 * Simulates heads or tails
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class CoinToss {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Simulates heads or tails");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
