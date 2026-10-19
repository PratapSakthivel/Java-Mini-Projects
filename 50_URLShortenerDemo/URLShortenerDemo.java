// Project 50: URLShortenerDemo
// Creates deterministic short codes

import java.util.*;
public class URLShortenerDemo { public static void main(String[] args) { Map<String,Integer> data=new LinkedHashMap<>(); data.put("Item A",10);data.put("Item B",20);data.put("Item C",15); System.out.println("Creates deterministic short codes"); data.forEach((k,v)->System.out.println(k+": "+v)); System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum()); } }
