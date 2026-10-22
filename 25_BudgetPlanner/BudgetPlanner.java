// Project 25: BudgetPlanner
// Checks spending against budget

import java.util.*;

/**
 * Checks spending against budget
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class BudgetPlanner {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Checks spending against budget");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
