package com.fullstack.javacore.ArraysBasic.BasicCodes;

public class ReverseWord {
        public void reverseEachWordInString(String str1) {
            String[] each_words = str1.split(" ");
            String revString = "";
            for (int i = 0; i < each_words.length; i++) {
                String word = each_words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                revString = revString + reverseWord + " ";
            }
            System.out.println(revString);
        }
        public static void main(String[] args) {
            ReverseWord obj = new ReverseWord();
            String StrGiven = "Java J2EE Reverse Me";
            System.out.println("The given string is: " + StrGiven);
            System.out.println("The string reversed word by word is: ");
            obj.reverseEachWordInString(StrGiven);
        }
    }

