package com.fullstack.javacore.CollectionTopics.Java8;

import java.util.Optional;

public class StringInUppercase {
    public StringInUppercase() {
    }

    public static void main(String[] args) {
        String input1 = "Akshay Chemuri";
        String input2 = null;
        Optional<String> result1 = StringInUppercase.StringUppercase.uppercaseString(input1);
        Optional<String> result2 = StringInUppercase.StringUppercase.uppercaseString((String)input2);
        if (result1.isPresent()) {
            System.out.println("Uppercase string of input1: " + (String)result1.get());
        } else {
            System.out.println("Input1 is empty");
        }

        if (result2.isPresent()) {
            System.out.println("Uppercase string of input2: " + (String)result2.get());
        } else {
            System.out.println("Input2 is empty");
        }

    }
    public class StringUppercase {
        public StringUppercase(StringInUppercase this$0) {
        }

        public static Optional<String> uppercaseString(String input) {
            return input == null ? Optional.empty() : Optional.of(input.toUpperCase());
        }
}
}
