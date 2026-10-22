// Project 49: MovieTicketBooking
// Books movie tickets

import java.util.*;

/**
 * Books movie tickets
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class MovieTicketBooking {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Books movie tickets");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
