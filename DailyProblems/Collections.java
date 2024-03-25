package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>();
        s.add("Aa");
        s.add("b");
        s.add("d");
        s.add("aA");
        s.add("f");
        s.add("c");

        System.out.println(s);
    }
}
