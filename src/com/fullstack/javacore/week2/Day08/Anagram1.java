package com.fullstack.javacore.week2.Day08;
import java.util.Arrays;
public class Anagram1 {
    public void checkAnagram(String str1,String str2){
          str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        boolean flag=false;
        if(str1.length() == str2.length()) {
            char[] charStr1 = str1.toCharArray();
            char[] charStr2 = str2.toCharArray();
            for(int i=0;i<str2.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(charStr1[i] == charStr2[j]){
                              flag= true;
                    }
                    else{
                           flag= false;


                    }
                }
            }
            if(flag){
                System.out.println("it is anagram");
            }
            else {
                System.out.println("length is same but not anagram");
            }
        }
        else{
            System.out.println("length is not equal");
        }

    }
    public static void main(String[] args){
        String new1="Listen";
         String new2="Silent";
        Anagram1 a=new Anagram1();
        a.checkAnagram(new1,new2);
    }
}
