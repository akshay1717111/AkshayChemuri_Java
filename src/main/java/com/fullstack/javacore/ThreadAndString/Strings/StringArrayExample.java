package com.fullstack.javacore.ThreadAndString.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class StringArrayExample {
    public static void main(String[] args) {
        String[] strings = {"Kumar", "Jason", "Henry", "Matt"};

        String[] capitalizedStrings = Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        Arrays.stream(capitalizedStrings)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
