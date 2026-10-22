// Project 56: ProducerConsumerDemo
// Demonstrates thread coordination

import java.util.concurrent.*;

public class ProducerConsumerDemo {
    public static void main(String[] a)throws Exception {
        BlockingQueue<Integer> q=new ArrayBlockingQueue<>(3);
        Thread p=new Thread(()-> {
            try {
                for(int i=1;i<=5;i++) {
                    q.put(i);System.out.println("Produced "+i);
                }
            }
            catch(Exception e) {
            }
        }
        );
        Thread c=new Thread(()-> {
            try {
                for(int i=1;i<=5;i++)System.out.println("Consumed "+q.take());
            }
            catch(Exception e) {
            }
        }
        );
        p.start();
        c.start();
        p.join();
        c.join();
    }
}
