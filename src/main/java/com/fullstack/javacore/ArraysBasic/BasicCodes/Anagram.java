package com.fullstack.javacore.ArraysBasic.BasicCodes;
import java.util.Arrays;

public class Anagram {

    public void checkAnagram(String str1, String str2){


        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
       if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();


            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
    public static void main(String[] args) {
        String firstString = "Listen";
        String secondString = "Silent";
        Anagram a=new Anagram();
        a.checkAnagram(firstString, secondString);
    }
}