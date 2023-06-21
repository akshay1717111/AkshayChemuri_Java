package com.fullstack.javacore.week4.Day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Akshay");
        stringList.add("Kumar");
        stringList.add("CIS");
        stringList.add("Kesh");

        // Convert ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);
        // Print the converted array
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

