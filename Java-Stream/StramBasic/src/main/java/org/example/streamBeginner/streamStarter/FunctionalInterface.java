package org.example.streamBeginner.streamStarter;
import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterface {

    // A functional interface is a interface that contains exactly one abstract method.
    public void funcInter1(){
        List<String> names = Arrays.asList("raj", "yash");
        Function<String, Integer> findLen = name -> name.length();
        names.stream().map(findLen).filter(l -> l > 3).forEach(System.out::println);
    }
}
