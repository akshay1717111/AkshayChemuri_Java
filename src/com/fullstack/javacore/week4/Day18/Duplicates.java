package com.fullstack.javacore.week4.Day18;

import java.util.LinkedHashSet;

public class Duplicates {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charSet.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "Akshay Chemuri";
        String result = removeDuplicates(input);
        System.out.println(result);
    }


}

