// Project 42: ParkingLotManager
// Tracks parking slots

import java.util.*;

/**
 * Tracks parking slots
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ParkingLotManager {
    public static void main(String[] args) {
        Map<String,Integer> data=new LinkedHashMap<>();
        data.put("Item A",10);
        data.put("Item B",20);
        data.put("Item C",15);
        System.out.println("Tracks parking slots");
        data.forEach((k,v)->System.out.println(k+": "+v));
        System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum());
    }
}
