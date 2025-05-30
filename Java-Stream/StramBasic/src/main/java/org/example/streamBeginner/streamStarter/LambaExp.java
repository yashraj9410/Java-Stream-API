package org.example.streamBeginner.streamStarter;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambaExp {

    // Bi Function functional interface
    public void lamdaUse1(){
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        // BiFunction(Integer, Integer, Integer) add = (a, b) -> a + b;
        // BiFunction is functional interface provided by the function package of java (T, U , V)
        // T and U are the function args and V is the return type of the function;
        System.out.println(sum.apply(32,4));
    }

    // Predicate functional Interface
    // Deals in true false logic
    // used in filter in stream basis true and false values
    public void lamdaPredicate(){

        List<String> names = Arrays.asList("yash", "Adeeb", "Onkar");
        Predicate<String> startWithA = name -> name.startsWith("A");

        names.stream()
                .filter(startWithA)      // here we can see that filter takes method predicate for imlementing
                                         // logic based on true and false returned by our predicate
                .forEach(System.out::println);
    }


    // Comparator
    public void lamdaComparator(){
        List<String> names  = Arrays.asList("yash", "raj", "adeeb", "onkar");
        names.sort(String::compareTo); // alphabetical ascending
        names.sort(Comparator.reverseOrder()); // alphabetically reverse
        names.sort(Comparator.comparingInt(String::length)); // based on length
        // String :: compareTo denotes (A:string, B:String) -> A.compareTo(B)
        names.forEach(name -> System.out.println(name));
    }
}
