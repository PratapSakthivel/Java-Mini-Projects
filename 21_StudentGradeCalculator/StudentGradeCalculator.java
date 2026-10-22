// Project 21: StudentGradeCalculator
// Calculates grade from marks

import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        double m=s.nextDouble();
        String g=m>=90?"A+":m>=80?"A":m>=70?"B":m>=60?"C":m>=50?"D":"F";
        System.out.println("Grade: "+g);
    }
}
