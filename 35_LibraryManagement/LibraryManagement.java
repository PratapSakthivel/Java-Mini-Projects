// Project 35: LibraryManagement
// Issue and return books

import java.util.*;

/**
 * Issue and return books
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class LibraryManagement {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Issue and return books");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
