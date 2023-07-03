package com.fullstack.javacore.CollectionTopics.Java8;

import java.util.Optional;

public class StringLength  {
    public StringLength() {
    }

    public static void main(String[] args) {
        String input1 = "Venkata Naveen";
        String input2 = null;
        Optional<Integer> length1 = StringLength.StringCheck.getStringLength(input1);
        Optional<Integer> length2 = StringLength.StringCheck.getStringLength((String)input2);
        if (length1.isPresent()) {
            System.out.println("Length of input1: " + String.valueOf(length1.get()));
        } else {
            System.out.println("Input1 is null");
        }

        if (length2.isPresent()) {
            System.out.println("Length of input2: " + String.valueOf(length2.get()));
        } else {
            System.out.println("Input2 is null");
        }

    }
    public class StringCheck {
        public StringCheck(StringLength this$0) {
        }

        public static Optional<Integer> getStringLength(String input) {
            return input == null ? Optional.empty() : Optional.of(input.length());
        }
    }}
