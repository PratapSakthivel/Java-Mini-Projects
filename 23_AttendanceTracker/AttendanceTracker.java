// Project 23: AttendanceTracker
// Calculates attendance percentage

import java.util.*;

/**
 * Calculates attendance percentage
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class AttendanceTracker {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Calculates attendance percentage");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
