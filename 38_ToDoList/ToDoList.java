// Project 38: ToDoList
// Adds and completes tasks

import java.util.*;

/**
 * Adds and completes tasks
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ToDoList {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        List<String> tasks=new ArrayList<>();
        while(true) {
            System.out.println("1 Add 2 List 3 Complete 0 Exit");
            int c=Integer.parseInt(s.nextLine());
            if(c==0)break;
            if(c==1)tasks.add(s.nextLine());
            else if(c==2)for(int i=0;i<tasks.size();i++)System.out.println((i+1)+". "+tasks.get(i)); else if(c==3) {
                int i=Integer.parseInt(s.nextLine())-1;if(i>=0&&i<tasks.size())tasks.remove(i);
            }
        }
    }
}
