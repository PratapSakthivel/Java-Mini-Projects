// Project 22: CGPACalculator
// Calculates CGPA average

import java.util.*;
public class CGPACalculator { public static void main(String[] a){Scanner s=new Scanner(System.in); int n=s.nextInt(); double sum=0; for(int i=0;i<n;i++)sum+=s.nextDouble(); System.out.printf("CGPA: %.2f%n",sum/n);} }
