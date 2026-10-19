// Project 14: FibonacciSeries
// Prints Fibonacci numbers

import java.util.*;
public class FibonacciSeries { public static void main(String[] a){Scanner s=new Scanner(System.in); int n=s.nextInt(); long x=0,y=1; for(int i=0;i<n;i++){System.out.print(x+(i<n-1?" ":"")); long z=x+y;x=y;y=z;}} }
