// Project 31: CurrencyConverter
// Converts INR and USD using sample rate

import java.util.*;

/**
 * Converts INR and USD using sample rate
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class CurrencyConverter {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Converts INR and USD using sample rate");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
