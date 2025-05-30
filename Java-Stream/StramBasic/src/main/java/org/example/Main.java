package org.example;
import java.util.*;
import org.example.streamBeginner.StreamBasic;
import org.example.streamBeginner.streamStarter.LambaExp;

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
    }
}
