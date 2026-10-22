// Project 59: RegexEmailValidator
// Validates email format

import java.util.*;

/**
 * Validates email format
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class RegexEmailValidator {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        String e=s.nextLine();
        System.out.println(e.matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")?"Valid":"Invalid");
    }
}
