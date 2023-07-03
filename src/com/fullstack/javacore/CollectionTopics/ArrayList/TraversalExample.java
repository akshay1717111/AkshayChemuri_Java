package com.fullstack.javacore.CollectionTopics.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversalExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Akshay");
        stringList.add("Kumar");
        stringList.add("CIS");
        stringList.add("Kesh");

        // 1. Traverse using for loop
        System.out.println("for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // 2. Traverse using enhanced for loop
        System.out.println("\n enhanced for loop");
        for (String element : stringList) {
            System.out.println(element);
        }

        // 3. Traverse using iterator
        System.out.println("\n iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // 4. Traverse using forEach
        System.out.println("\nforEach:");
        stringList.forEach(System.out::println);

        // 5. Traverse using parallel stream
        System.out.println("\n parallel stream:");
        stringList.parallelStream().forEach(System.out::println);

        //6.
        // Remove the last object
        int lastIndex = stringList.size() - 1;
        if (lastIndex >= 0) {
            stringList.remove(lastIndex);
            System.out.println("\nLast object removed.");
        } else {
            System.out.println("\nList is empty. No object to remove.");
        }

        // Print the list after removing the last object
        System.out.println("\nList after removing the last object:");
        System.out.println(stringList);
    }
}

