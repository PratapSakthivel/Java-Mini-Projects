// Project 10: PasswordGenerator
// Generates a random password

import java.util.*;

/**
 * Generates a random password
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        Map<String,Integer> data=new LinkedHashMap<>();
        data.put("Item A",10);
        data.put("Item B",20);
        data.put("Item C",15);
        System.out.println("Generates a random password");
        data.forEach((k,v)->System.out.println(k+": "+v));
        System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum());
    }
}
