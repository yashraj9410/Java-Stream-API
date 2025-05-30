package org.example.streamBeginner;
import java.util.*;

public class StreamBasic {

    // Task is to print the longest string given a list of strings
    // mapToInt is used to map the length of each string in int
    // max selects the max of those length
    // orElse is used to coovert optional int to int
    // :: is scope resoultion which takes the reference of the previous function
    public void example1(){
        List<String>  names = Arrays.asList("Alice", "Bob", "Charlie");
        int mapToInt = names.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        names.stream().filter(name -> name.length() == mapToInt).forEach(name -> System.out.println(name));
    }



    // Example 2
    public void example2(){

    }
}
