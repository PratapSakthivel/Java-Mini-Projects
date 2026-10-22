// Project 41: TicketBooking
// Books limited seats

import java.util.*;

/**
 * Books limited seats
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class TicketBooking {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Books limited seats");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
