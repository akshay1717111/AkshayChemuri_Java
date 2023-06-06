package com.fullstack.javacore.week2;

public class ReverseNumber {
    public void reverseMethod(int number) {
        int lastNumber;
        int reverse = 0;
        while (number > 0) {
            lastNumber = number % 10;
            reverse = 10 * reverse + lastNumber;
            number = number / 10;
        }
        System.out.println(reverse);

    }
}



