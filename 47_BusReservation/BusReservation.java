// Project 47: BusReservation
// Reserves bus seats

import java.util.*;

/**
 * Reserves bus seats
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class BusReservation {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Reserves bus seats");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
