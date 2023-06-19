package com.fullstack.javacore.week3.Day14;

import java.util.Arrays;

class Vowels {
    public static void main(String[] args) {
        String[] strings = {"Kumar", "Jason", "Henry", "Matt"};

        Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiou].*"))
                .forEach(s -> System.out.println(s + " - " + countVowels(s)));
    }

    private static int countVowels(String s) {
        return (int) s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".contains(c.toString().toLowerCase()))
                .count();
    }
}
