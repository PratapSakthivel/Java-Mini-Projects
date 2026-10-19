// Project 13: FactorialCalculator
// Calculates factorial

import java.util.*; import java.math.*;
public class FactorialCalculator { public static void main(String[] a){Scanner s=new Scanner(System.in); int n=s.nextInt(); BigInteger f=BigInteger.ONE; for(int i=2;i<=n;i++)f=f.multiply(BigInteger.valueOf(i)); System.out.println(f);} }
