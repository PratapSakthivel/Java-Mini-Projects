// Project 02: SimpleCalculator
// Performs basic arithmetic

import java.util.*;
public class SimpleCalculator { public static void main(String[] a) { Scanner s=new Scanner(System.in); System.out.print("Enter two numbers: "); double x=s.nextDouble(), y=s.nextDouble(); System.out.println("+="+(x+y)+" -= "+(x-y)+" *= "+(x*y)+" /= "+(y!=0?x/y:"undefined")); } }
