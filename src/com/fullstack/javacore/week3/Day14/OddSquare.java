package com.fullstack.javacore.week3.Day14;

import java.util.Arrays;

public class OddSquare {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
