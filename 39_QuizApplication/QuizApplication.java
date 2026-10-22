// Project 39: QuizApplication
// Runs a multiple-choice quiz

import java.util.*;

public class QuizApplication {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        String[] q= {
            "Java keyword to inherit a class?","Size of int in Java (bits)?","Collection that stores unique values?"
        }
        ;
        String[] ans= {
            "extends","32","set"
        }
        ;
        int score=0;
        for(int i=0;i<q.length;i++) {
            System.out.println(q[i]); if(s.nextLine().trim().equalsIgnoreCase(ans[i]))score++;
        }
        System.out.println("Score: "+score+"/"+q.length);
    }
}
