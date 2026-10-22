// Project 43: HotelRoomBooking
// Books hotel rooms

import java.util.*;

/**
 * Books hotel rooms
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class HotelRoomBooking {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Books hotel rooms");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
