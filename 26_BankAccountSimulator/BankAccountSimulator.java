// Project 26: BankAccountSimulator
// Deposit and withdraw simulation

import java.util.*;
public class BankAccountSimulator { public static void main(String[] a){Scanner s=new Scanner(System.in); double bal=1000; while(true){System.out.println("1 Deposit 2 Withdraw 3 Balance 0 Exit"); int c=s.nextInt(); if(c==0)break; if(c==1)bal+=s.nextDouble(); else if(c==2){double x=s.nextDouble(); if(x<=bal)bal-=x; else System.out.println("Insufficient funds");} else if(c==3)System.out.println("Balance: "+bal);}} }
