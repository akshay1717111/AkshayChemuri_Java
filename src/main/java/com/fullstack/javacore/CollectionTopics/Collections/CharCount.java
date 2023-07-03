package com.fullstack.javacore.CollectionTopics.Collections;

import java.util.HashMap;

public class CharCount {
    public static void printDistinctCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        String emptyString = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : charCountMap.keySet()) {
            int count = charCountMap.get(ch);
            System.out.println(ch + "-" + count);
        }
    }

    public static void main(String[] args) {
        String input = "test string";
        printDistinctCharacters(input);
    }
}

