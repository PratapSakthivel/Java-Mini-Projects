// Project 58: JSONBuilderDemo
// Builds JSON text without libraries

import java.util.*;
public class JSONBuilderDemo { public static void main(String[] args) { Map<String,Integer> data=new LinkedHashMap<>(); data.put("Item A",10);data.put("Item B",20);data.put("Item C",15); System.out.println("Builds JSON text without libraries"); data.forEach((k,v)->System.out.println(k+": "+v)); System.out.println("Total: "+data.values().stream().mapToInt(Integer::intValue).sum()); } }
