package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static  void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("DOG");
        set1.add("HELLO");
        set1.add("PET");

        Set<String> set2 = new HashSet<>();
        set2.add("CAT");
        set2.add("HELLO");
        set2.add("BYE");

        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        Set<Integer> set4 = new HashSet<>();
        set4.add(0);
        set4.add(1);
        set4.add(2);

        Set<Character> characters = new HashSet<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        Set<Character> characters1 = new HashSet<>();
        characters1.add('V');
        characters1.add('D');
        characters1.add('C');
        characters1.add('1');

        System.out.println("symmetricDifference(set1, set2) = " + symmetricDifference(set1, set2));
        System.out.println("symmetricDifference(set1, set2) = " + symmetricDifference(set3, set4));
        System.out.println("symmetricDifference(set1, set2) = " + symmetricDifference(characters, characters1));


    }

    public static <T> Set<T>  symmetricDifference(Set<T> s1, Set<T> s2) {
            Set<T> newSet = new HashSet<>(s1);
            newSet.removeAll(s2);
            s2.removeAll(s1);
            newSet.addAll(s2);
            return newSet;
    }
}
