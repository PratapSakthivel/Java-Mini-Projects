// Project 03: TemperatureConverter
// Converts Celsius and Fahrenheit

import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Converts Celsius and Fahrenheit");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
