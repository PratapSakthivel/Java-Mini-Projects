// Project 30: CompoundInterestCalculator
// Calculates compound interest

import java.util.*;

/**
 * Calculates compound interest
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Map<String,Integer> data=new LinkedHashMap<>();
        data.put("Item A",10);
        data.put("Item B",20);
        data.put("Item C",15);
        System.out.println("Calculates compound interest");
        data.forEach((k,v)->System.out.println(k+": "+v));
        System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum());
    }
}
