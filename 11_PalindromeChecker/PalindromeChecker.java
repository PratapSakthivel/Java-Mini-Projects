// Project 11: PalindromeChecker
// Checks palindrome text

import java.util.*;
public class PalindromeChecker { public static void main(String[] a) { Scanner s=new Scanner(System.in); String x=s.nextLine().replaceAll("[^A-Za-z0-9]","").toLowerCase(); String r=new StringBuilder(x).reverse().toString(); System.out.println(x.equals(r)?"Palindrome":"Not palindrome"); } }
