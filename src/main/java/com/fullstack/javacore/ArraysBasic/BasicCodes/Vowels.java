package com.fullstack.javacore.ArraysBasic.BasicCodes;
public class Vowels {

    static void findVowels(){
      String newString = "Akshay Chemuri";
      int totalVowels=0;
      for(int i=0;i<newString.length();i++){
          char c=newString.charAt(i);
          if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u'){
              totalVowels++;
          }
      }

      System.out.println("Total vowels in the sentence is "+totalVowels);
    }
    public static void main(String[] args) {
                    findVowels();
    }
}
