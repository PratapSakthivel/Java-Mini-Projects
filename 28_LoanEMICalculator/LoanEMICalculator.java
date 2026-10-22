// Project 28: LoanEMICalculator
// Calculates EMI

import java.util.*;

/**
 * Calculates EMI
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class LoanEMICalculator {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble(), annual=s.nextDouble();
        int months=s.nextInt();
        double r=annual/1200;
        double emi=r==0?p/months:p*r*Math.pow(1+r,months)/(Math.pow(1+r,months)-1);
        System.out.printf("EMI: %.2f%n",emi);
    }
}
