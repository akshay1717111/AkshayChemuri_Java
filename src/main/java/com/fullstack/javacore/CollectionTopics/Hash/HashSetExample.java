package com.fullstack.javacore.CollectionTopics.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();

        // Adding 10 strings to the HashSet
        stringHashSet.add("ABC");
        stringHashSet.add("DEF");
        stringHashSet.add("GHI");
        stringHashSet.add("JKL");
        stringHashSet.add("MNO");
        stringHashSet.add("PQR");
        stringHashSet.add("SUV");
        stringHashSet.add("WXY");
        stringHashSet.add("ZAB");
        stringHashSet.add("CDE");

        System.out.println("\n" + "using Iterator");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

        }
        System.out.println("\n" + "using ForEach");

        for (String element : stringHashSet) {
            System.out.println(element);
        }

        System.out.println("\n" + "using Streams ForEach");
        stringHashSet.stream().forEach(System.out::println);
    }
}
