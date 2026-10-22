// Project 51: CaesarCipher
// Encrypts text using Caesar cipher

import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        int[] values= {
            12,7,25,9,18
        }
        ;
        Arrays.sort(values);
        System.out.println("Encrypts text using Caesar cipher");
        System.out.println("Sorted data: "+Arrays.toString(values));
        System.out.println("Max: "+values[values.length-1]);
    }
}
