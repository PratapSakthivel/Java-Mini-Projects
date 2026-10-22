// Project 01: HelloWorldApp
// Prints a welcome message

import java.util.*;

public class HelloWorldApp {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>(Arrays.asList("Java","SQL","Git"));
        System.out.println("Prints a welcome message");
        data.forEach(System.out::println);
        System.out.println("Total records: "+data.size());
    }
}
