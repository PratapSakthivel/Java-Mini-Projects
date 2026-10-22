// Project 55: LRUCacheDemo
// Demonstrates an LRU cache

import java.util.*;

/**
 * Demonstrates an LRU cache
 *
 * @author PratapSakthivel
 * @version 1.0
 */
public class LRUCacheDemo {
    static class LRU<K,V> extends LinkedHashMap<K,V> {
        private final int cap;
        LRU(int c) {
            super(c,.75f,true);
            cap=c;
        }
        protected boolean removeEldestEntry(Map.Entry<K,V> e) {
            return size()>cap;
        }
    }
    public static void main(String[] a) {
        LRU<Integer,String> c=new LRU<>(3);
        c.put(1,"A");
        c.put(2,"B");
        c.put(3,"C");
        c.get(1);
        c.put(4,"D");
        System.out.println(c);
    }
}
