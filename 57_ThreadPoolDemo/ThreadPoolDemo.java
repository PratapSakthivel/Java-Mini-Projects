// Project 57: ThreadPoolDemo
// Runs tasks with ExecutorService

import java.util.concurrent.*;

/**
 * Runs tasks with ExecutorService
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] a)throws Exception {
        ExecutorService ex=Executors.newFixedThreadPool(3);
        for(int i=1;i<=6;i++) {
            int id=i;ex.submit(()->System.out.println("Task "+id+" by "+Thread.currentThread().getName()));
        }
        ex.shutdown();ex.awaitTermination(5,TimeUnit.SECONDS);
    }
}
