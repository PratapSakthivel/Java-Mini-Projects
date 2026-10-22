// Project 15: ArmstrongNumberChecker
// Checks Armstrong numbers

import java.util.*;

/**
 * Checks Armstrong numbers
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Checks Armstrong numbers");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
