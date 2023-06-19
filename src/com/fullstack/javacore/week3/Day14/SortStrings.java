package com.fullstack.javacore.week3.Day14;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"Kumar", "Jason", "Henry", "Matt"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
