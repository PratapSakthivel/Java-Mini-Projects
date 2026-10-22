// Project 46: WaterBillCalculator
// Calculates water bill

import java.util.*;

/**
 * Calculates water bill
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class WaterBillCalculator {
    public static void main(String[] args) {
        Map<String,Integer> data=new LinkedHashMap<>();
        data.put("Item A",10);
        data.put("Item B",20);
        data.put("Item C",15);
        System.out.println("Calculates water bill");
        data.forEach((k,v)->System.out.println(k+": "+v));
        System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum());
    }
}
