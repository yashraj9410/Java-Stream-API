package org.example;
import java.util.*;
import java.util.stream.Stream;

import org.example.streamBeginner.StreamBasic;
import org.example.streamBeginner.streamStarter.LambaExp;
import org.example.streamExamples.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        StreamBasic st = new StreamBasic();
        st.example1();
        LambaExp l = new LambaExp();
        l.lamdaUse1();
        l.lamdaPredicate();
        l.lamdaComparator();

        StudentAvg studentAvg = new StudentAvg();
        List<List<String>> studentMarks = Arrays.asList(
            Arrays.asList("Alice", "90"),
            Arrays.asList("Bob", "95"),
            Arrays.asList("Alice", "100"),
            Arrays.asList("Bob", "85")
        );
        System.out.println(studentAvg.findAverage(studentMarks));
    }
}
