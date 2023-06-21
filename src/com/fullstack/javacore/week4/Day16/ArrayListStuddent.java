package com.fullstack.javacore.week4.Day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStuddent {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("CIS");
        stringList.add("Kesh");
        stringList.add("Akshay");
        stringList.add("Kumar");

        // Print the list before removing the last object
        System.out.println("List before removing the last object:");
        System.out.println(stringList);

        // Remove the last object
        int lastIndex = stringList.size() - 1;
        if (lastIndex >= 0) {
            stringList.remove(lastIndex);
            System.out.println("\n Last index removed.");
        } else {
            System.out.println("\n  No index to remove it is empty.");
        }

        // Print the list after removing the last object
        System.out.println("\nList after removing the last object:");
        System.out.println(stringList);
    }
}

