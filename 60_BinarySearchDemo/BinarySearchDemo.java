// Project 60: BinarySearchDemo
// Performs binary search

import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] a) {
        int[] x= {
            2,5,8,12,16,23,38,56,72,91
        }
        ;
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(),l=0,r=x.length-1;
        while(l<=r) {
            int m=(l+r)/2;
            if(x[m]==t) {
                System.out.println("Found at index "+m);
                return;
            }
            if(x[m]<t)l=m+1;
            else r=m-1;
        }
        System.out.println("Not found");
    }
}
