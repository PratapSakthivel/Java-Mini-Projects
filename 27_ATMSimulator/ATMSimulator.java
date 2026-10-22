// Project 27: ATM Simulator
// PIN-based ATM simulation

import java.util.*;

/**
 * PIN-based ATM simulation
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ATMSimulator {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("PIN-based ATM simulation");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
