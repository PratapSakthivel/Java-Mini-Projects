// Project 12: PrimeNumberChecker
// Checks whether a number is prime

import java.util.*;
public class PrimeNumberChecker { static boolean prime(int n){if(n<2)return false; for(int i=2;i*i<=n;i++)if(n%i==0)return false; return true;} public static void main(String[] a){Scanner s=new Scanner(System.in); System.out.println(prime(s.nextInt())?"Prime":"Not prime");} }
